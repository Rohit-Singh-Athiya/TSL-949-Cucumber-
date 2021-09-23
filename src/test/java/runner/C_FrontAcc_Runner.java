package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/C_FrontAcc_DataDriven.feature" 
                 , glue = "stepdefinition"
                 , monochrome = true  // used for Formatting console and removing unwanted statements
                 , dryRun=false  // Used to check each step with a matching step before running the actual test
	,plugin = {"pretty","html:target/frontacc.html","json:target/JsonReport/frontaccjson.json"}
		)

public class C_FrontAcc_Runner 
{

}
