package seleniumDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
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