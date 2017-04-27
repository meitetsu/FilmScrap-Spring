package pl.meitetsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication
public class FilmscrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilmscrapApplication.class, args);
	}
}
