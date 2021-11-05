package com.movies.movielookup;

import io.cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
                features = {"src/test/resources/feature/"},
                glue = {"src/test/resources/feature"})

public class RunnerClass {

}
