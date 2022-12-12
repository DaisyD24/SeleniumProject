package steps;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	

	ChromeDriver driver;

	@Given("Launch ChromeBrowser and Load URL")
	public void launchChromeBrowserAndLoadURL() {
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver ();
		
		//Enter URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		// maximize
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

   @Given("Enter Username as DemoCSR")
	public void enterUsernameAsDemoCSR() {
		driver.findElementById("username").sendKeys("DemoCSR");
	}

	@Given("Enter Password as crmsfa")
	public void enterPasswordASCrmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("Click the LogIn button")
	public void clickTheLogInButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("It's navigated HomePage")
	public void itSNavigatedHomePage() {
		System.out.println(driver.getTitle());
	
	}

	@Then("Click the LogOut button")
	public void clickTheLogOutButton() {
		driver.findElementByClassName("decorativeSubmit").click();    
	}

	@Then("Close browser")
	public void closeBrowser() {
	    driver.close();
	}

	@Given("Enter Username as Daisy")
	public void enterUsernameAsDaisy() {
		driver.findElementById("username").sendKeys("Daisy");    

	}
	@Then("it's navigate same Page")
	public void itSNnavigatedSamePage() {
		System.out.println(driver.getTitle());
	}

	@Then("verify error message")
	public void verifyErrorMessage() { 
		String text = driver.findElementById("errorDiv").getText();
		System.out.println(text);

		if (text.contains("following error occurred during login")) {
			System.out.println("Error message is contains");
		}else {
			System.out.println("Error message is not contains");
		}		
	}

	/*@Given("click CRMSFA")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@Given("click leads link")
	public void clickLeadsLink() {
		driver.findElementByLinkText("Leads").click();
	}
	@When("click createLead")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	@When("enter the company as ABC")
	public void enterTheCompanyAsABC() {
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
	}
	@When("enter the firstname as Hema")
	public void enterTheFirstnameAsHema() {
		driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	}
	@When("enter the lastname as Mali")
	public void enterTheLastnameAsMali() {
		driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	}
	@When("choose source as Website")
	public void chooseSourceAsWebsite() {
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd1 = new Select(src);
		dd1.selectByVisibleText("Website");*/
	}
	
		
	
	
	

