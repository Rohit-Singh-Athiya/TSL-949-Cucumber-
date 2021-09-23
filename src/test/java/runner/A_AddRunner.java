package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/features/A_Add.feature" , glue = "stepdefinition")
	
	public class A_AddRunner
	{
 
    }
