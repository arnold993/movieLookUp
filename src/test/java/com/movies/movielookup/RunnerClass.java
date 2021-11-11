package com.movies.movielookup;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;

//@CucumberContextConfiguration
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = {"src/test/resources/feature/"})

public class RunnerClass {

    }
