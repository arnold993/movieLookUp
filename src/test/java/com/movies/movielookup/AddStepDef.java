package com.movies.movielookup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class AddStepDef {

    @Autowired
    private FilmRepository film;
    private Film newFilm;

    @Given("The movie I want to add is named {string}")
    public void theMovieIWantToAddIsNamed(String title) {
    }

    @When("I add the movie with film id {int}, title {string}, description {string}, year {int}, language id {int}, duration {int},  rating {string}")
    public void iAddTheNewMovie(int filmId, String title, String description, int year, int languageId, int duration, String rating) {
        newFilm = new Film(filmId, title, description, year, languageId, duration, rating);
        film.save(newFilm);
    }

    @Then("The new movie should be called {string}")
    public void theNameOfTheMovie(String actualFilmTitle) {
        assertEquals(film.searchByTitle(newFilm.getTitle()).get(0).getTitle(), actualFilmTitle);
    }
}
