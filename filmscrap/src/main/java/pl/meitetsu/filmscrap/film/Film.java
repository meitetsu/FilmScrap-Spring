package pl.meitetsu.filmscrap.film;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;

@Document
final class Film 
{
	@Id
	private String id;
	
	//@Field("client")
	private String title;
	private String year;
	private String titlePL;
	
	public Film() {	}
	
//	public Film(String id, String title, String year, String titlePL) 
//	{
//		super();
//		this.id = id;
//		this.title = title;
//		this.year = year;
//		this.titlePL = titlePL;
//	}
	
	public Film(Builder builder)
	{
		this.title = builder.title;
		this.titlePL = builder.titlePL;
		this.year = builder.year;
	}
	
	static Builder getBuilder()
	{
		return new Builder();
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
	
	public String getTitlePL() 
	{
		return titlePL;
	}
	
	public void setTitlePL(String titlePL) 
	{
		this.titlePL = titlePL;
	}
	
	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}
	
	public void update(String title, String titlePL, String year)
	{
		this.title = title;
		this.titlePL = titlePL;
		this.year = year;
	}
	
	public String toString()
	{
		return String.format(
				"Film[id=%s, title=%s, titlePL=%s, year=%s]",
				this.id,
				this.title,
				this.titlePL,
				this.year
		);
	}
	
	static class Builder
	{
		private String title;
		private String titlePL;
		private String year;
		
		private Builder() {}
		
		Builder title(String title)
		{
			this.title = title;
			return this;
		}
		
		Builder titlePL(String titlePL)
		{
			this.titlePL = titlePL;
			return this;
		}
		
		Builder year(String year)
		{
			this.year = year;
			return this;
		}
		
		Film build()
		{
			Film build = new Film(this);
			//build.check(build.getTitle(), build.getTitlePL(), build.getYear());
			return build;
		}
	}
}
