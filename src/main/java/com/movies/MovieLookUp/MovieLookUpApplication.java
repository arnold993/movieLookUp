package com.movies.MovieLookUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@SpringBootApplication
@RequestMapping("/movies")
public class MovieLookUpApplication {
	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieLookUpApplication.class, args);
	}
// Used to find all movies
	@GetMapping("/all")
	public @ResponseBody
	Iterable<Film> getAllFilm() {
		return filmRepository.findAll();
	}
//Used to search titles by name
	//	@RequestMapping("/searchFilm")
	@RequestMapping(value = "/searchFilm", method = GET)
	public @ResponseBody
	Iterable<Film> searchFilm(@RequestParam("title") String title) {
		return filmRepository.searchByTitle(title);
	}
//Used to add movies
	@PostMapping("/addMovie")
	public @ResponseBody
	String addAMovie(
					 @RequestParam int film_id,
					 @RequestParam String title,
					 @RequestParam String description,
					 @RequestParam int yearOfRelease,
					 @RequestParam int language_id,
					 @RequestParam int duration,
					 @RequestParam String rating) {


		Film savedFilm = new Film(film_id, title, description, yearOfRelease, language_id, duration, rating);
		filmRepository.save(savedFilm);
		return "New film added, thank you";
	}




/*	@PutMapping("/updateMovie")
	public @ResponseBody
	String updateAMovie(@RequestParam int film_id,
					 @RequestParam String description)
 {
		Film updateFilm = filmRepository.findById(film_id);
		updateFilm.setDescription(description);
	 	filmRepository.save(updateFilm);
		return "Updated, thank you";

	}

 */
}


/*		Film film = new Film("Ironman, Age of Ultron","Ironman fights robots",2017,"English",188,8);
		return film.getJsonObjectOfFilm();
	}
*/


