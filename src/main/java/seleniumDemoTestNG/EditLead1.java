package seleniumDemoTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead1 {

	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			//Enter URL
			driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize window
			driver.manage().window().maximize();
			//implicitly wait
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//enter username
			driver.findElementById("username").sendKeys("DemoSalesManager");
			//enter password
			driver.findElementById("password").sendKeys("crmsfa");
			//click login
			driver.findElementByClassName("decorativeSubmit").click();
			//click CRM/SFA
			driver.findElementByLinkText("CRM/SFA").click();
			
			//Click leads link
			driver.findElementByXPath("//a[text() = 'Leads']").click();
			
			//Click findLeads link
			driver.findElementByXPath("//a[text() = 'Find Leads']").click();
			
			//Enter lead id
			driver.findElementByXPath("//input[@id = 'ext-gen246']").sendKeys("TC");
			
			//Enter first name
			driver.findElementByXPath("//div[@id = 'x-form-el-ext-gen248']/input").sendKeys("Hema");
			
			//Enter last name
			driver.findElementByXPath("(//input[@name = 'lastName'])[3]").sendKeys("Mali");
			
			//Enter company name
			driver.findElementByXPath("//div[@id = 'x-form-el-ext-gen252']/input").sendKeys("TCS");
			
			//Click Name and ID
			driver.findElementByXPath("//span[text() = 'Name and ID']").click();
			
			//Click phone
			driver.findElementByXPath("//span[text() = 'Phone']").click();
			
			//Enter phone number(area code)
		    driver.findElementByXPath("//input[@name = 'phoneAreaCode']").sendKeys("518");
			
			//Enter phone number
			driver.findElementByXPath("//input[@name = 'phoneNumber']").sendKeys("671234");
			
			//Click Email
			driver.findElementByXPath("//span[text() = 'Email']").click();
			
			//Enter Email
			driver.findElementByXPath("//div[@id = 'x-form-el-ext-gen282']/input").sendKeys("abc@ab.com");
			
			//Click Find leads button
			driver.findElementByXPath("//button[text() = 'Find Leads']").click();
				

		}

	

	}


