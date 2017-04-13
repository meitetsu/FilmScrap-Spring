package pl.meitetsu.filmscrap.film;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmService 
{
	@Autowired
	private FilmRepository filmRepository;
	
//	private List<Film> films = new ArrayList<>(Arrays.asList(
//			new Film("Zielona Mila", "1999", "Dramat"),
//			new Film("Forrest Gump", "1994", "Dramat"),
//			new Film("Skazani na Shawshank", "1994", "Dramat"),
//			new Film("Matrix", "1999", "Sci-Fi"),
//			new Film("Leon Zawodowiec", "1994", "Dramat")
//			));
	
	public List<Film> getAllFilms()
	{
		List<Film> films = new ArrayList<>();
		filmRepository.findAll().forEach(films::add);
		return films;
	}
	
	public Film getFilm(String title)
	{
		return filmRepository.findOne(title);
	}
	
	public void addFilm(Film film)
	{
		filmRepository.save(film);
	}

	public void updateFilm(String title, Film film) 
	{
		filmRepository.save(film);
	}
	
	public void deleteFilm(String title) 
	{
		filmRepository.delete(title);
	}
}
