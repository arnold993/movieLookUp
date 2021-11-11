package com.movies.movielookup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@CucumberContextConfiguration
@SpringBootTest
public class UpdateStepDef {

    @Autowired
    private FilmRepository film;
    private Film newFilm;

    @Given("The the film named {string} has the wrong description")
    public void theFilmWithTheWrongDescription(String title) {
    }


    @When("I update the description of the movie with title {string} to {string}")
    public void iUpdateTheMovie(String title, String description) {
        Film newFilm = film.searchByTitle(title).get(1000);
        newFilm.setDescription(description);
        film.save(newFilm);

    }

    @Then("the movie {string} should the description changed to {string}")
    public void theMovieShouldTheDescriptionChangedTo(String title, String description) {
        assertEquals(film.searchByTitle(title).get(1000).getDescription(),description);
    }
}
