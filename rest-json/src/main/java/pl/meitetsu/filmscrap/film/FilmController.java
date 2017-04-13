package pl.meitetsu.filmscrap.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmController 
{
	@Autowired
	private FilmService filmService;
	
	// GET
	@RequestMapping("/films")
	public List<Film> getAllFilms()
	{
		return filmService.getAllFilms();
	}
	
	// GET
	@RequestMapping("/films/{title}")
	public Film getFilm(@PathVariable String title)
	{
		return filmService.getFilm(title);
	}
	
	// POST
	@RequestMapping(method=RequestMethod.POST, value="/films")
	public void addFilm(@RequestBody Film film)
	{
		filmService.addFilm(film);
	}
	
	// UPDATE
	@RequestMapping(method=RequestMethod.PUT, value="/films/{title}")
	public void updateFilm(@RequestBody Film film, @PathVariable String title)
	{
		filmService.updateFilm(title, film);
	}
	
	//DELETE
	@RequestMapping(method=RequestMethod.DELETE, value="/films/{title}")
	public void deleteTopic(@PathVariable String title)
	{
		filmService.deleteFilm(title);
	}
}
