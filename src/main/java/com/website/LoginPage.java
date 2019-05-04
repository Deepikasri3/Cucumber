package com.website;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(xpath="//input[@type='email']")
	private WebElement emailId;
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogIn() {
		return logIn;
	}
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(id="signInSubmit")
	private WebElement logIn;

public LoginPage(WebDriver idriver) {
	this.driver=idriver;
	PageFactory.initElements(driver, this);
}
}
