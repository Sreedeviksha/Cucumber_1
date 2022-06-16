package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.helper.PageObjectManager;
import com.adactin.pom.HomePage;
import com.adactin.runner.TestRunner;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver =TestRunner.driver ;
	PageObjectManager pom = new PageObjectManager(driver);
	

	@Given("user launches the application")
	public void user_launches_the_application() {
	//	driver = getBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");

	}

	@When("user enters the valid username in the username field")
	public void userEntersTheValidUsernameInTheUsernameField() {
		HomePage hp = new HomePage(driver);
		inputValuestoElement(pom.getHp().getUsername(), "SreeDeviksha");
		//inputValuestoElement(hp.getUsername(), "SreeDeviksha");
	}

	@When("user enters the valid password in the password field")
	public void user_enters_the_valid_password_in_the_password_field() {
		HomePage hp = new HomePage(driver);
		 inputValuestoElement(hp.getPassword(), "viksha");
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		HomePage hp = new HomePage(driver);
		clickonElement(hp.getLogin());
	}

	
	@Then("user verifies homepage navigates to the search hotel page")
	public void user_verifies_homepage_navigates_to_the_search_hotel_page() {
	    
	}

	}
