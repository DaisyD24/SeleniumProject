/**
 * 
 */
package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Daisy
 * 
 * This class will store all the locators and the methods of Login Page of Test Leaf application
 *
 */
public class LoginPage {
	
	//1. Create Reference variable of WebDriver
	WebDriver driver ;
	
	
	//2. Create All the locator of LoginPage
	By userName = By.id("username");
	By passWord = By.id("password");
	By logInButton = By.className("decorativeSubmit");

	//3. Create Constructor of LoginPage
	public LoginPage(WebDriver driver) {
		
	this.driver = driver;
		
	}
	
	//4. Create methods for all locators one by one
	public void typeUserName() {
		
		driver.findElement(userName).sendKeys("DemoSalesManager");
	}
	
	public void typePassWord() {
		
		driver.findElement(passWord).sendKeys("crmsfa");
	}
	
	public void clickLoginButton() {
		
		driver.findElement(logInButton).click();
		
		
	}
	
	
}