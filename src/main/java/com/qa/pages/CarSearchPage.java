package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Driverfactory.SeleniumWebDriver;


public class CarSearchPage {

	@FindBy(id ="makes")
	public WebElement makeDropDown;
	
	@FindBy(id ="models")
	public WebElement modelDropDown;
	
	@FindBy(id ="locations")
	public WebElement locationDropDown;

	@FindBy(id ="priceTo")
	public WebElement priceDropDown;
	
	@FindBy(id ="search-submit")
	public WebElement findMyNextCarButton;
	
	public CarSearchPage() {
		PageFactory.initElements(SeleniumWebDriver.getDriver(), this);
	}
	
	public void selectModel(String model) {
		
		Select selectModelObj = new Select(modelDropDown);
		selectModelObj.selectByVisibleText(model);
		
	}
	
	public void selectMake(String make) {
		Select selectMakeObj = new Select(makeDropDown);
		selectMakeObj.selectByVisibleText(make);
	}
	
	public void selectLocation(String location) {
		Select selectLocationObj = new Select(locationDropDown);
		selectLocationObj.selectByVisibleText(location);
	}
	
	public void selectPrice(String price) {
		Select selectPriceObj = new Select(priceDropDown);
		selectPriceObj.selectByVisibleText(price);
	}
	
	public void clickFindMyNextCarButton() {
		 findMyNextCarButton.click();
	}
}
