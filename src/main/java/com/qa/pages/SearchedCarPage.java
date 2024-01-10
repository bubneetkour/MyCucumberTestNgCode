package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Driverfactory.SeleniumWebDriver;

public class SearchedCarPage {
	@FindBy(xpath="//div[@class='searchTop']/h1")
	public WebElement searchedCarTitle;
	
	
	public SearchedCarPage() {
		PageFactory.initElements(SeleniumWebDriver.getDriver(), this);
	}
	
public String getSearchedCarPageHeader() {
		
		return(searchedCarTitle.getText());
		
	}
}
