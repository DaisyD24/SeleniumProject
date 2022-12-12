package alert_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");

//Create object of ChromeDriver Class

ChromeDriver driver = new ChromeDriver ();

//Load URL
  driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
  
  //Maximize window
  
  driver.manage().window().maximize();
  
  //Implicitly wait
  
  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  
  //Click Submit
  driver.findElementByXPath("//input[@id='searchBtn']").click();
  
  //switch control to Alert from HTML page and get the Alert text
  
    String simpleAlert = driver.switchTo().alert().getText();
    System.out.println(simpleAlert);
    
    Thread.sleep(3000);
    driver.switchTo().alert().accept();
    
    
	
	  

	}

}
