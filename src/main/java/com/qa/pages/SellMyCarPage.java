package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Driverfactory.SeleniumWebDriver;

public class SellMyCarPage {

	@FindBy(xpath="//button[contains(text(),'Get instant offer')]")
	WebElement getInstantOfferBtn;
	
	@FindBy(xpath="//button[contains(text(),'Start your listing')]")
	WebElement startYourListingBtn;
	
	@FindBy(css ="div[class='sellBanner--title']")
	WebElement sellMyCarPageHeader;
	
	
	public SellMyCarPage() {
	 PageFactory.initElements(SeleniumWebDriver.getDriver(), this);
	}
	public Boolean isInstantOfferButtonDisplayed() {
		return getInstantOfferBtn.isDisplayed();
	}
	
	public Boolean isStartYourListingButtonDisplayed() {
		return startYourListingBtn.isDisplayed();
	}
	
	public String getSellMyCarPageHeader() {
		return sellMyCarPageHeader.getText();
	}
}
