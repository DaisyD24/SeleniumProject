package seleniumDemoTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead1 {

	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			//enter URL
			driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize window
			driver.manage().window().maximize();
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//enter Username
			driver.findElementById("username").sendKeys("DemoSalesManager");
			//enter password
			driver.findElementById("password").sendKeys("crmsfa");
			//click login
			driver.findElementByClassName("decorativeSubmit").click();
			
			//click CRM/SFA
			driver.findElementByLinkText("CRM/SFA").click();
			
				 // click Leads
			    driver.findElementByLinkText("Leads").click();
			    
			    // click Find lead link
			    driver.findElementByLinkText("Find Leads").click();
			    
			    //Click on name and id
			    driver.findElementByXPath("//span[text() = 'Name and ID']").click();
			    
			    // click on phone
			    driver.findElementByXPath("//span[text()='Phone']").click();
			    
			    // enter phone number(areaCode)
			    driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
			    
			    // enter phone number
			    driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
			    
			   // click on email
			    driver.findElementByXPath("//span[text()='Email']").click();
			    
			    // enter email address
			    driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("abc@abc.com");
			    
			    //Click find leads button
			    driver.findElementByXPath("//button[text() = 'Find Leads']").click();	

		}

	

	}


