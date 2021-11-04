package com.movies.movielookup;

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
	@GetMapping(value = "/searchFilm")
	public @ResponseBody
	Iterable<Film> searchFilm(@RequestParam("title") String title) {
		return filmRepository.searchByTitle(title);
	}
//Used to add movies
	@PostMapping("/addMovie")
	public @ResponseBody
	String addAMovie(
					 @RequestParam int filmId,
					 @RequestParam String title,
					 @RequestParam String description,
					 @RequestParam int yearOfRelease,
					 @RequestParam int languageId,
					 @RequestParam int duration,
					 @RequestParam String rating) {


		Film savedFilm = new Film(filmId, title, description, yearOfRelease, languageId, duration, rating);
		filmRepository.save(savedFilm);
		return "New film added, thank you";
	}

//movie update
	@PutMapping("/updateMovie")
		public @ResponseBody
		String updateAMovie(@RequestParam int filmId,
						 @RequestParam String description)
	 {
			var updateFilm  = filmRepository.findById(filmId).get();
			updateFilm.setDescription(description);
			filmRepository.save(updateFilm);
			return "Updated, thank you";

		}

	@DeleteMapping("/deleteMovie")
	public @ResponseBody
	String deleteMovie(@RequestParam int filmId)
	{
		var deleteFilm  = filmRepository.findById(filmId).get();
		filmRepository.delete(deleteFilm);
		return "Movie has been deleted";

	}

}


