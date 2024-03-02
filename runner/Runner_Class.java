package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Krishnaraj K A\\eclipse-workspace\\sel2024\\CucumberClass\\src\\test\\java\\feature", glue = "stepdefinition", 
dryRun = false, 
tags = "@tag2",
publish = true)

public class Runner_Class {

}
