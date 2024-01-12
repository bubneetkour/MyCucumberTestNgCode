package com.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Driverfactory.SeleniumWebDriver;

public class CarsHomePage {
	
	@FindBy(linkText= "buy + sell")
	public WebElement buySellMenuLink;
	
	@FindBy(linkText="Search Cars")
	public WebElement searchCarsSubMenuLink;

	@FindBy(linkText="Used")
	public WebElement searchUsedCarsSubMenuLink;
	
	@FindBy(linkText= "reviews")
	public WebElement reviewsMenuLink;
	
	@FindBy(linkText = "All reviews")
	WebElement allReviewsSubMenuLink;
	
	@FindBy(linkText = "Sell my car")
	WebElement sellMyCarSubMenuLink;
	
	public CarsHomePage() {
	   // selDriver = new SeleniumWebDriver();
		PageFactory.initElements(SeleniumWebDriver.getDriver(),this);
		
	}
	
	public void moveToBuySellLink() {
		Actions obj = new Actions(SeleniumWebDriver.getDriver());
		obj.moveToElement(buySellMenuLink).build().perform();
		//Actions obj = new Actions(SeleniumWebDriver.browserInitialization());
		//obj.moveToElement(carHomePageLocatorsObj.buySellMenuLink).build().perform();
	}

	public void clickSearchCarsLink() {
		
		searchCarsSubMenuLink.click();
		//carHomePageLocatorsObj.searchCarsSubMenuLink.click();
	}
	
	public void clickSearchUsedCarsLink() {
		
		searchUsedCarsSubMenuLink.click();
		//carHomePageLocatorsObj.searchUsedCarsSubMenuLink.click();
		
	}
    public void clickUsedSearchUsedCarsLink() {
		
    	
		searchUsedCarsSubMenuLink.click();
		
	}
    
    public void moveToReviewsLink() {

    	Actions obj = new Actions(SeleniumWebDriver.getDriver());
		obj.moveToElement(reviewsMenuLink).build().perform();
    }
    public void clickAllReviewsLink() {

    	Actions obj = new Actions(SeleniumWebDriver.getDriver());
		obj.moveToElement(reviewsMenuLink).build().perform();
    }
    
    public void clickSellMyCarLink() {
    	sellMyCarSubMenuLink.click();
    }
}


