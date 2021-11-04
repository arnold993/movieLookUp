package com.movies.MovieLookUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class SearchTest {

    @Autowired

    private FilmRepository filmRepository;
    private Film film;

    private List<Film> answer;
    private String titleOfFilm;

    @Given("that i am on the search page")
    public void isAvailable() {;
    }

    @When("I search for {string}" )
    public void iSearchForMovie (String title) {
        answer = filmRepository.searchByTitle(title);
    }

    @Then("I should be told {string} is available")
    public Film iShouldBeTold(String title) {
        assertEquals(answer.get(0).getTitle(), titleOfFilm);
        return answer.get(0);
    }
}
