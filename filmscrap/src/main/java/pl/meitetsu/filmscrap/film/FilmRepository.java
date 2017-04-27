package pl.meitetsu.filmscrap.film;

import java.util.List;
//import java.util.Optional;
import java.util.Optional;

//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(collectionResourceRel = "title", path = "title")
public interface FilmRepository extends Repository<Film, String>
{
	//List<Film> findByTitle(@Param("title") String title);
	List<Film> findAll();
	Optional<Film> findOne(String title);
	//void deleteFilm(Film deleted);
	Film save(Film saved);
	void delete(Film deleted);
}
