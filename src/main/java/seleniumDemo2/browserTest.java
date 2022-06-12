package seleniumDemo2;

import org.openqa.selenium.chrome.ChromeDriver;

public class browserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver,chrome.driver","C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe") ;
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("leads").click();

	}

}
