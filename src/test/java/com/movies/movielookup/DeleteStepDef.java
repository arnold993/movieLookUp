package com.movies.movielookup;

import gherkin.lexer.Fi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


@SpringBootTest
public class DeleteStepDef {

    @Autowired
    private FilmRepository film;
    private Film oldFilm;
    private Film result;

    
    @Given("that the movie I want to delete is {string}")
    public void thatTheMovieIWantToDeleteIs(String title) {
        film.deleteById(result.getFilmId());
        
    }

    @When("I try to delete the movie")
    public void iTryToDelete() {
        film.deleteById((result.getFilmId()));
    }

    @Then("the film {string} should not appear in the database")
    public void theFilmDeletedFromDatabase(String deletedMovie) {
        assertNotEquals(result.getFilmId(), film.searchByTitle(deletedMovie).get(0).getFilmId());
    }
}
