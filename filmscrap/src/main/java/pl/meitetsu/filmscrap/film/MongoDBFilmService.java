package pl.meitetsu.filmscrap.film;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import static java.util.stream.Collectors.toList;

@Service
final class MongoDBFilmService implements FilmService
{
	private final FilmRepository filmRepository;
	
	@Autowired
	MongoOperations mongo;
	
	@Autowired
	MongoDBFilmService(FilmRepository filmRepository)
	{
		this.filmRepository = filmRepository;
	}
	
	@Override
	public List<FilmDTO> getAllFilms()
	{
//		List<Film> films = new ArrayList<>();
//		filmRepository.findAll().forEach(films::add);
		List<Film> films = filmRepository.findAll();
		return convertToDTOs(films);
	}
	
	private List<FilmDTO> convertToDTOs(List<Film> models) 
	{
        return models.stream()
                .map(this::convertToDTO)
                .collect(toList());
    }
	
	public FilmDTO getFilm(String title)
	{
		Film found = getFilmByTitle(title);
		return convertToDTO(found);
		//return filmRepository.findOne(title);
	}
	
	@Override
	public FilmDTO addFilm(FilmDTO film)
	{
		//filmRepository.save(film);
		Film persisted = Film.getBuilder()
				.title(film.getTitle())
				.titlePL(film.getTitlePL())
				.year(film.getYear())
				.build();
		persisted = filmRepository.save(persisted);
		return convertToDTO(persisted);
	}

	@Override
	public FilmDTO updateFilm(FilmDTO film, String title) 
	{
		//filmRepository.save(film);
		Film updated = getFilmByTitle(film.getTitle());
		updated.update(film.getTitle(), film.getTitlePL(), film.getYear());
		updated = filmRepository.save(updated);
		return convertToDTO(updated);
	}
	
	@Override
	public FilmDTO deleteFilm(String title) 
	{
		//filmRepository.delete(title);
		Film deleted = getFilmByTitle(title);
		filmRepository.delete(deleted);
		return convertToDTO(deleted);
	}
	
	private Film getFilmByTitle(String title) 
	{
        Optional<Film> result = filmRepository.findOne(title);
        return result.orElseThrow(() -> new FilmNotFoundException(title));
 
    }
	
	private FilmDTO convertToDTO(Film model) 
	{
        FilmDTO dto = new FilmDTO();
 
        dto.setId(model.getId());
        dto.setTitle(model.getTitle());
        dto.setTitlePL(model.getTitlePL());
        dto.setYear(model.getYear());
 
        return dto;
    }
	
	
}
