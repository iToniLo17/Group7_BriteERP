package com.cybertek.BriteERP.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/cybertek/BriteERP/stepdefinitions",
        features = "src/test/resources",
        dryRun = true


)


public class BriteRunner {
}
