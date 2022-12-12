package seleniumDemoTestNG;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead1 {

	public static void main(String[] args) throws InterruptedException {
	
	
		
		
	        
			System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			//maximize
			driver.manage().window().maximize();
			//Enter Username
			driver.findElementById("username").sendKeys("DemoSalesManager");
			//Enter Password
			driver.findElementById("password").sendKeys("crmsfa");
			//Click Login Button
			driver.findElementByClassName("decorativeSubmit").click();
			
			//Click crm/sfa link
			
			driver.findElementByLinkText("CRM/SFA").click();
			//Click leads
			driver.findElementByLinkText("Leads").click();
			//Click Create Lead Link
			
			driver.findElementByLinkText("Create Lead").click();
			//Company Name
			
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
			//Enter First Name
			try {
			driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
			} catch (NoSuchElementException e) {
				System.out.println("The element not found");
				
			}
			Thread.sleep(2000);
			//throw new RuntimeException();
			//Enter LastName
			driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
			
			WebElement src = driver.findElementById("createLeadForm_dataSourceId");
			Select dd1 = new Select(src);
			dd1.selectByVisibleText("Conference");
			
			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Ms.");
			
			WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
			Select dd2 = new Select(industry);
			dd2.selectByVisibleText("Computer Software");
			
			WebElement ownrsp = driver.findElementById("createLeadForm_ownershipEnumId");
			Select dd3 = new Select(ownrsp);
			dd3.selectByValue("OWN_PARTNERSHIP");
			
			driver.findElementById("createLeadForm_description").sendKeys("TCS");
			driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("1");
			driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("682");
			driver.findElementById("createLeadForm_departmentName").sendKeys("MKT");
			driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
			driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("google.com");
			
			WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
			Select dd4 = new Select(state);
			dd4.selectByIndex(9);
			
			WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
			Select dd5 = new Select(country);
			dd5.selectByVisibleText("United States");
			
			driver.findElementById("createLeadForm_generalPostalCode").sendKeys("75061");
			
			WebElement mktcmp = driver.findElementById("createLeadForm_marketingCampaignId");
			Select dd6 = new Select(mktcmp);
			dd6.selectByValue("CATRQ_CAMPAIGNS");
			
			driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
			driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@gmail.com");
			
			driver.findElementByName("submitButton").click();
		}

	

	}


