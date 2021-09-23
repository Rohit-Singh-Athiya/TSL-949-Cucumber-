package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/B_SeleniumDev.feature" , glue = "stepdefinition")

public class B_SeleniumDev_Runner
{

}
