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
public class SearchStepDef {

    @Autowired
    private FilmRepository filmRepository;
    private Film film;

    private List<Film> answer;

    @Given("that i am on the search page")
    public void isAvailable() {;
    }

    @When("I search for {string}" )
    public void iSearchForMovie (String title) {
        answer = filmRepository.searchByTitle(title);
    }

    @Then("I should be told {string} is available")
    public Film iShouldBeTold(String title) {
        assertEquals(answer.get(0).getTitle(), title);
        return answer.get(0);
    }
}
