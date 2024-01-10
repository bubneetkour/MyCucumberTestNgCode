package parallel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.qa.Driverfactory.SeleniumWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	 public static Properties prop;
	 static SeleniumWebDriver  selWebDriverObj;
	 WebDriver driver ;
	 
	@Before
     public void before_all() throws IOException {
		
		try {
			prop = new Properties();
			
			FileInputStream fip = new FileInputStream("./src/test/resources/config/config.properties");
		    prop.load(fip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
//			prop.load(ip);
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		//return prop;
		
		
		selWebDriverObj = new SeleniumWebDriver();
		driver = selWebDriverObj.init_driver(prop.getProperty("browser"));
		System.out.println("launch browser");
	}
	
	@After
public  void after_all(Scenario scenario) {
		
		System.out.println("close browser");
	    driver.quit();
		if(scenario.isFailed())
		{
			System.out.println(scenario +" scenario failed");
			//File screenShot = ((TakesScreenshot)SeleniumWebDriver.getDriver()).getScreenshotAs(OutputType.FILE);
			File screenShot = ((TakesScreenshot)SeleniumWebDriver.getDriver()).getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(screenShot,new File("/Users/bubneetkour/eclipse-workspace/CucumberPOMframework/target/screenshot.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}
		
		
			
	}

}
