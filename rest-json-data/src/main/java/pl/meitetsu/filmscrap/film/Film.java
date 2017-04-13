package pl.meitetsu.filmscrap.film;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Film 
{
	@Id
	private String title;
	private String productionYear;
	private String genre;
	
	public Film() {	}
	
	public Film(String title, String productionYear, String genre) 
	{
		super();
		this.title = title;
		this.productionYear = productionYear;
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
	
	public String getProductionYear() 
	{
		return productionYear;
	}
	
	public void setProductionYear(String productionYear) 
	{
		this.productionYear = productionYear;
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
