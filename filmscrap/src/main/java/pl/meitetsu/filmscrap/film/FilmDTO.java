package pl.meitetsu.filmscrap.film;

public class FilmDTO 
{
	private String id;
	private String title;
	private String titlePL;
	private String year;
	
	public FilmDTO() {}
	
	public FilmDTO(String id, String title, String titlePL, String year) 
	{
		super();
		this.id = id;
		this.title = title;
		this.titlePL = titlePL;
		this.year = year;
	}
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getTitlePL() 
	{
		return titlePL;
	}
	public void setTitlePL(String titlePL) 
	{
		this.titlePL = titlePL;
	}
	public String getYear() 
	{
		return year;
	}
	public void setYear(String year) 
	{
		this.year = year;
	}
	
	
}
