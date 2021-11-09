package com.movies.movielookup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
// FAIL SCENARIO
    @Given("the film id has not been given")
    public void theFilmIdHasNotBeenGiven() {
    }


    @When("I attempt to add the move to the database")
    public void iAttemptToAddTheMoveToTheDatabase(String title, String description, int year, int languageId, int duration, String rating) {
        newFilm = new Film(title, description, year, languageId, duration, rating);
    }

    @Then("I should be told {string}")
    public String iShouldBeTold(String arg0) {
        assertEquals(0,newFilm.getFilmId());
        return "Film Id missing, please add the ID";
    }

}
