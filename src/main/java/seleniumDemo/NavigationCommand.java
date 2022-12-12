package seleniumDemo;

public class NavigationCommand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Windows\\SeleniumSoft\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver  driver = new  ChromeDriver();
	
	driver.get("http://google.com");
		
	}

}