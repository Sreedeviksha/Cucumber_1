package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.HomePage;

public class PageObjectManager {

	public static WebDriver driver;
	
	private HomePage hp;
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver =ldriver;

	}

	public HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}
	
}
