package com.movies.MovieLookUp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MovieLookUpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieLookUpApplication.class, args);
	}

	@GetMapping("/getMovie")
	public String movieInfo() {
		Film film = new Film("Ironman, Age of Ultron","Ironman fights robots",2017,"English",188,8);
		return film.getJsonObjectOfFilm();
	}

}
