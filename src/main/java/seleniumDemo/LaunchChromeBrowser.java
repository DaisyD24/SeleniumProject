package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
//Creating object of CromeDriver Class
System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
//creating object of ChromeDriver Class
ChromeDriver driver = new ChromeDriver();
	}
	
/get url:
driver.get("http://leaftaps.com/opentaps/control/main");
//window maximize
driver.manage().window().maximize();