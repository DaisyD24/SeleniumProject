package javaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		//Launch ChromeBrowser
System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

//Creating object of ChromeDriver class
//Syntax of object creation: ClassName obj = new ClassName();

ChromeDriver driver = new ChromeDriver();
//load URL
driver.get("http://leaftaps.com/opentaps/control/login");
//Maximize window
driver.manage().window().maximize();

//Implicitly wait
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//enter username
driver.findElementById("username").sendKeys("DemoSalesManager");
//enter password
driver.findElementById("password").sendKeys("crmsfa");
//Click login
driver.findElementByClassName("decorativeSubmit").click();
//click CRM/SFA
driver.findElementByLinkText("CRM/SFA").click();
//click on Leads
driver.findElementByLinkText("Leads").click();
//click create lead link
driver.findElementByLinkText("Create Lead").click();

//
driver.findElementById("createLeadForm_companyName").sendKeys("ABC");

driver.findElementById("createLeadForm_firstName").sendKeys("Hema");

driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
//Explicitly wait
Thread.sleep(2000);
//Click create lead button
driver.findElementByClassName("smallSubmit").click();













	}

}
