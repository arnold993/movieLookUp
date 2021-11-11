package com.movies.movielookup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.junit.Assert.assertEquals;


@SpringBootTest
public class SearchStepDef {

    @Autowired
    private FilmRepository filmRepository;
    private Film film;
    private List<Film> answer;
    private String filmTitle;

    @Given("the movie {string} is available")
    public void theMovieIsAvailable(String title) {

    }

    @When("I search for {string}")
    public void iSearchFor(String title) {
        answer = filmRepository.searchByTitle(title);
    }

    @Then("The movie should appear in the results")
    public void theMovieShouldAppearInTheResults() {
        filmTitle = "CIDER DESIRE";
        assertEquals(answer.get(0).getTitle(), filmTitle);
//        return answer.get(0);
    }


}
