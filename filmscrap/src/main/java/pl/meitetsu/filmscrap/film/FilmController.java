package pl.meitetsu.filmscrap.film;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
final class FilmController 
{
	private FilmService filmService;
	
	@Autowired
	FilmController(FilmService filmService)
	{
		this.filmService = filmService;
	}
	
	// GET
	@RequestMapping(method=RequestMethod.GET, value="/films")
	List<FilmDTO> getAllFilms()
	{
		return filmService.getAllFilms();
	}
	
	// GET
	@RequestMapping(method=RequestMethod.GET, value="/films/{title}")
	FilmDTO getFilm(@PathVariable String title)
	{
		return filmService.getFilm(title);
	}
	
	// POST
	@RequestMapping(method=RequestMethod.POST, value="/films")
	FilmDTO addFilm(@RequestBody @Valid FilmDTO film)
	{
		//filmService.addFilm(film);
		return filmService.addFilm(film);
	}
	
	// UPDATE
	@RequestMapping(method=RequestMethod.PUT, value="/films/{title}")
	FilmDTO updateFilm(@RequestBody @Valid FilmDTO film, @PathVariable String title)
	{
		return filmService.updateFilm(film, title);
	}
	
	//DELETE
	@RequestMapping(method=RequestMethod.DELETE, value="/films/{title}")
	FilmDTO deleteFilm(@PathVariable String title)
	{
		//filmService.deleteFilm(title);
		return filmService.deleteFilm(title);
	}
	
}
