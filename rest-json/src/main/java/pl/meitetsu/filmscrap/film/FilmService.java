package pl.meitetsu.filmscrap.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FilmService 
{
	private List<Film> films = new ArrayList<>(Arrays.asList(
			new Film("Zielona Mila", "1999", "Dramat"),
			new Film("Forrest Gump", "1994", "Dramat"),
			new Film("Skazani na Shawshank", "1994", "Dramat"),
			new Film("Matrix", "1999", "Sci-Fi"),
			new Film("Leon Zawodowiec", "1994", "Dramat")
			));
	
	public List<Film> getAllFilms()
	{
		return films;
	}
	
	public Film getFilm(String title)
	{
		return films.stream().filter(f -> f.getTitle().equals(title)).findFirst().get();
	}
	
	public void addFilm(Film film)
	{
		films.add(film);
	}

	public void updateFilm(String title, Film film) 
	{
		for (int i = 0; i < films.size(); i++)
		{
			Film f = films.get(i);
			if (f.getTitle().equals(title))
			{
				films.set(i, film);
				return;
			}
		}
	}
	
	public void deleteFilm(String title) 
	{
		films.removeIf(f -> f.getTitle().equals(title));
	}
}
