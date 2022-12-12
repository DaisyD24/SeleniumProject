package seleniumDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MargeLead {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//Enter URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize
		driver.manage().window().maximize();
		
		//implictely wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Enter username
		driver.findElementByXPath("//input[@id = 'username']").sendKeys("DemoSalesManager");
		
		//Enter password
		driver.findElementByXPath("//input[@name = 'PASSWORD']").sendKeys("crmsfa");
		
		//Click login
		driver.findElementByXPath("//input[@class = 'decorativeSubmit']").click();
		
		//Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click Leads
		driver.findElementByXPath("//a[text() = 'Leads']").click();
		
		//Click Merge Leads
		driver.findElementByXPath("//a[text() = 'Merge Leads']").click();
		
		//Enter From lead
		driver.findElementByXPath("//input[@id = 'ComboBox_partyIdFrom']").sendKeys("10039");
		
		//Enter To lead
		driver.findElementByXPath("//input[@id = 'ComboBox_partyIdTo']").sendKeys("10040");
		
		//Click Merge button
		driver.findElementByXPath("//a[text() = 'Merge']").click();
		
		//Switch control to Alert from HTML page and get the Alert text
			String ComAlert = driver.switchTo().alert().getText();
			
			System.out.println(ComAlert);
			
			Thread.sleep(3000);
			
			//Click on OK or accept alert
			driver.switchTo().alert().accept();
			
			//Click on Cancel or dismiss alert
			driver.switchTo().alert().dismiss();
			
			//close browser
			driver.close();

		}

	
	}


