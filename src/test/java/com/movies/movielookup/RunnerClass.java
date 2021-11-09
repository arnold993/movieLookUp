package com.movies.movielookup;

import io.cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

@CucumberContextConfiguration
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = {"src/test/resources/feature"},
        glue = {"src/test/java/com/movies/movielookup"})
public class RunnerClass {

}
