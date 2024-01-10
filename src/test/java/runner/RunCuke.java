package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//tags={"@sanity","@prod"}
@CucumberOptions(
		features = "src/test/resources/features",
		glue={"stepdefinitions"},
		tags="@New",
		plugin= {"pretty","html:target/Cucumber-reports/CucumberReport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class RunCuke extends AbstractTestNGCucumberTests {

	
}
