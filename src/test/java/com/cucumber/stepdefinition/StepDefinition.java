package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.cucumber.testrunner.TestRunner;
import com.website.HomePage;
import com.website.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	
	public static WebDriver driver=TestRunner.driver;
	
	
	@Given("^user should be in Amazon Home page$")
	public void user_should_be_in_Amazon_Home_page() throws Throwable {
		
		getUrl("https://www.amazon.com/");
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user mouse hover to signIn button in the Header$")
	public void user_mouse_hover_to_signIn_button_in_the_Header() throws Throwable {
		HomePage hp=new HomePage(driver);
		mouseHover(hp.getSignIn());
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click on signin button in Ajax call$")
	public void user_click_on_signin_button_in_Ajax_call() throws Throwable {
		HomePage hp=new HomePage(driver);
		elementClick(hp.getSignIn());
		
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enter the email/mobile number in the emailid field$")
	public void user_enter_the_email_mobile_number_in_the_emailid_field() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		inputValues(lp.getEmailId(),"9952088408");
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enter the password in the password field$")
	public void user_enter_the_password_in_the_password_field() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		inputValues(lp.getPassword(),"9952088408");
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("^user click on logIn button$")
	public void user_click_on_logIn_button() throws Throwable{
		LoginPage lp=new LoginPage(driver);
		elementClick(lp.getLogIn());
		
	}


}
