package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
	
				// Set Property:
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\\\chromedriver.exe");
		
				// Create ChromeDriver (Class) Object:
		WebDriver driver = new ChromeDriver();
		
				// Get / Input URL:
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
				// Maximize Window:
		driver.manage().window().maximize();
		
				// Implicitly Wait:
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		 		
				// Click button using XPath:
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
				// Using Alert Class:
		Alert PromptAlert = driver.switchTo().alert();
		PromptAlert.getText();
		
				// Print:
		System.out.println(PromptAlert.getText());
		
				// Explicitly Wait:
		Thread.sleep(3000);
		 
				// Using Sendkeys:
		PromptAlert.sendKeys("I am a Human");
		
				// Explicitly Wait:
		Thread.sleep(1500);
		
				// Click Ok button (accpet):
		PromptAlert.accept();
		
				// Get Result:
		driver.findElement(By.id("result")).getText();
				
				// Print Result:
		System.out.println(driver.findElement(By.id("result")).getText());
		
				// Get Current URL (Print):
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
				// Get Title (Print):
		//driver.getTitle();
		System.out.println(driver.getTitle());
		
		// Explicitly Wait:
		Thread.sleep(2000);
		
				// Close Window:
		//driver.close();
		driver.quit();
		
	}

}