package pl.meitetsu.filmscrap.film;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
//import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories("filmscrap.db")
public class MongoConfig extends AbstractMongoConfiguration 
{
	
	
	@Override
	protected String getDatabaseName()
	{
		return "FilmScrapDB";
	}
	
	@Override
	public Mongo mongo() throws Exception
	{
		return new MongoClient("207.154.229.152", 27017);
	}
	
}
