package stepsdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Selenium_Framwork\\CucumberAPP\\src\\test\\java\\feature\\Login.feature",	
	glue={"stepsdefination"},
	monochrome=true)

public class TestRunner {
	
}