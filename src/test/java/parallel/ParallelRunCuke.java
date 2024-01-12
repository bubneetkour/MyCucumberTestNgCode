package parallel;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/parallel",
glue= {"parallel"},
tags="@Sell",
plugin= {"pretty","html:target/Cucumber-reports/CucumberReport.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class ParallelRunCuke extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
