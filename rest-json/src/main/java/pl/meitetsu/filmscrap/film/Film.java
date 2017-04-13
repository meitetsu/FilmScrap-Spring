package pl.meitetsu.filmscrap.film;

public class Film 
{
	private String title;
	private String year;
	private String genre;
	
	public Film() {	}
	
	public Film(String title, String year, String genre) 
	{
		super();
		this.title = title;
		this.year = year;
		this.genre = genre;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getYear() 
	{
		return year;
	}
	
	public void setYear(String year) 
	{
		this.year = year;
	}
	
	public String getGenre() 
	{
		return genre;
	}
	
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}
}
