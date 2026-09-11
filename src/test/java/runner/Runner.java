package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/features", glue = { "stepDefinitions", "hooks" }, plugin = { "pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json: target/cucumber-reports/cucumber.json" }, monochrome = true, publish = true)
public class Runner extends AbstractTestNGCucumberTests {

}
