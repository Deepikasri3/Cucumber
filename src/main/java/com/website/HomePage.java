package com.website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;
	@FindBy(id="nav-link-accountList")
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}

	public HomePage(WebDriver idriver) {
		this.driver=idriver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	
}
