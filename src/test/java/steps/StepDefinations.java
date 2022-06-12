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
		
		 driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}

	@Given("Enter Username as DemoSalesManager")
	public void enterUsernameAsDemoSalesManager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("Enter Password as crmsfa")
	public void enterPasswordAsCrmsfa() {
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

	@Given("Launce ChromeBrowser and Load URL")
	public void launceChromeBrowserAndLoadURL() {
	    
	}

	@Given("Enter Username as Daisy")
	public void enterUsernameAsDaisy() {
		driver.findElementById("username").sendKeys("Daisy");    

}
