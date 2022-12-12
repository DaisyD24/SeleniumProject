package com.testleaf.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.testleaf.pages.LoginPage;

public class TC001_LogIn {
	
	//5. Create Java method for login and annotated by TestNG @Test, and write the all steps for launch browser and load URL
	@Test
	public void verifyLogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//get url:
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//window maximize:
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
		//6. Create Object of LoginPage and pass the driver, call the all methods from LoginPage and quite/close the browser
		LoginPage login = new LoginPage(driver);
		
		login.typeUserName();
		login.typePassWord();
		login.clickLoginButton();
		
		driver.quit();
		
	}

}