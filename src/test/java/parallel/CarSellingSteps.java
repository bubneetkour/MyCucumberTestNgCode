package parallel;

import org.testng.Assert;

import com.qa.Driverfactory.SeleniumWebDriver;
import com.qa.pages.CarsHomePage;
import com.qa.pages.SellMyCarPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CarSellingSteps {

	CarsHomePage carHomePageObj = new CarsHomePage();
	SellMyCarPage sellMyCarPageobj = new SellMyCarPage();
	@When("I click on the Sell my car Link")
	public void i_click_on_the_sell_my_car_link() {
		
		carHomePageObj.clickSellMyCarLink();
	}

	@Then("the Sell car page should open and the title should be {string}")
	public void the_sell_car_page_should_open_and_the_title_should_be(String sellCarPageTitle) {
	   Assert.assertEquals(SeleniumWebDriver.getDriver().getTitle(), sellCarPageTitle,"Sell Car Page Title doesnot match");
	}

	@Then("Verify the Sell car page Header text is {string}")
	public void verify_the_sell_car_page_header_text_is(String header) {
		Assert.assertTrue(sellMyCarPageobj.getSellMyCarPageHeader().contains(header),"Header doesnot match");
	}

	@Then("the Get Instant offer option should be available")
	public void the_get_instant_offer_option_should_be_available() {
		Assert.assertTrue(sellMyCarPageobj.isInstantOfferButtonDisplayed());
	}

	@Then("the Start your listing option shpuld also be available")
	public void the_start_your_listing_option_shpuld_also_be_available() {
		Assert.assertTrue(sellMyCarPageobj.isStartYourListingButtonDisplayed());
	}


}
