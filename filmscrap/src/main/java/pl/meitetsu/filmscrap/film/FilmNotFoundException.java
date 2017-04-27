package pl.meitetsu.filmscrap.film;

public class FilmNotFoundException extends RuntimeException
{
	public FilmNotFoundException(String title)
	{
		super(String.format("Nie znaleziono tytulu: <%s>", title));
	}
}
