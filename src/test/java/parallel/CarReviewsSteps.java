package parallel;

import java.util.List;

//import org.testng.Assert;

//import com.qa.Driverfactory.SeleniumWebDriver;
import com.qa.pages.CarsHomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarReviewsSteps {

	CarsHomePage carHomePageObj = new CarsHomePage();
	@When("I click on the All Reviews Link")
	public void i_click_on_the_all_reviews_link() {
		carHomePageObj.clickAllReviewsLink();
	}

	@Then("the Reviews page should open")
	public void the_reviews_page_should_open() {
		
	}
	
	@When("I move to Reviews menu")
	public void i_move_to_reviews_menu(io.cucumber.datatable.DataTable dataTable) {
		 List<List<String>> menuList =  dataTable.asLists();
		  System.out.println("Select car home page menu link ==> "+ menuList.get(1));
		  carHomePageObj.moveToReviewsLink();
		  System.out.println("Final changes");
    }
}
