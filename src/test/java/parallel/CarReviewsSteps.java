package parallel;

import java.util.List;
import org.testng.Assert;
import com.qa.Driverfactory.SeleniumWebDriver;
import com.qa.pages.CarsHomePage;
import com.qa.pages.CarsReviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarReviewsSteps {

	CarsHomePage carHomePageObj = new CarsHomePage();
	CarsReviewPage carReviewsPageObj = new CarsReviewPage();
	
	@When("I click on the All Reviews Link")
	public void i_click_on_the_all_reviews_link() {
		carHomePageObj.clickAllReviewsLink();
	}

	
	@When("I move to Reviews menu")
	public void i_move_to_reviews_menu(io.cucumber.datatable.DataTable dataTable) {
		 List<List<String>> menuList =  dataTable.asLists();
		  System.out.println("Select car home page menu link ==> "+ menuList.get(1));
		  carHomePageObj.moveToReviewsLink();
    }
	
	@Then("the Reviews page should open and the title should be {string}")
	public void the_reviews_page_should_open_and_the_title_should_be(String reviewPageTitle) {
		//Verify the Review Page title 
	    Assert.assertEquals(SeleniumWebDriver.getDriver().getTitle(),reviewPageTitle,"Reviews page title doesnot match");;
	}

	@Then("the correct header should be displayed {string}")
	public void the_correct_header_should_be_displayed(String header) {
	   Assert.assertEquals(carReviewsPageObj.getCarReviewPageHeader(), header,"Reviews Page Header text is incorrect");
	}

}
