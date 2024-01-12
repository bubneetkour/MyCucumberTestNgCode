package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Driverfactory.SeleniumWebDriver;

public class CarsReviewPage {
	
	@FindBy(xpath = "//div[contains(@class,'main-heading ')]/h1")
	WebElement reviewPageHeader;
	
	public CarsReviewPage() {
		PageFactory.initElements(SeleniumWebDriver.getDriver(),this );
	}
	public String getCarReviewPageHeader() {
		
		return reviewPageHeader.getText();
	}
	
	

}
