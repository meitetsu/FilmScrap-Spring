package pl.meitetsu.filmscrap.film;

import java.util.List;

public interface FilmService 
{
	FilmDTO addFilm(FilmDTO film);
	FilmDTO deleteFilm(String title);
	List<FilmDTO> getAllFilms();
	FilmDTO getFilm(String title);
	FilmDTO updateFilm(FilmDTO film, String title);
}
