package com.movies.MovieLookUp;

import io.cucumber.junit.Cucumber;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@ContextConfiguration
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = {"src/test/resources/feature"})

public class RunnerClass {

}
