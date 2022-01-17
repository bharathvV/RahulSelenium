package automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Micellaneous {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//to deleetd all cookies in browser
//		driver.manage().deleteCookieNamed("coookienamed");//delete a cookie with specific named
		

	}
}
