package cucumberoptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/deals.feature", //psth for feature file
		glue = {"stepDefinitions"},	//path for step def file
		plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
		strict=true,			// will check if any step is not define in step def file
		monochrome=true		//will display consle in readable format
		//dryRun=true		//check if mapping properly done between feature and step def file
		
		)
public class TestRunner extends AbstractTestNGCucumberTests{
	
}