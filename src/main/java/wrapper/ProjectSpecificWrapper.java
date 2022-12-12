package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//Super Class
public class ProjectSpecificWrapper {

	//public static void main(String[] args) {
		public ChromeDriver driver;	

		@BeforeMethod
		public void login() throws InterruptedException{ 		
			
			System.setProperty("webdriver.chrome.driver","C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
			 
			 driver = new ChromeDriver();
		
			//maximize
			driver.manage().window().maximize();
			
			//load U
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//Enter Username - (Element level)
			driver.findElementById("username").sendKeys("DemoSalesManager");
			
			//Enter Password - (Element level)
			driver.findElementById("password").sendKeys("crmsfa");
			
			// Click Login Button - (Element level)
			driver.findElementByClassName("decorativeSubmit").click();
			
			// click crm.sfa link
			Thread.sleep(2000);
			driver.findElementByLinkText("CRM/SFA").click();
			
			}	
		@AfterMethod
		public void closeBrowser() { 
			driver.close();
		}

	

	}


