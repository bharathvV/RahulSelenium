package automate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String password = getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(),
				"Hello rahul,");
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException

	{

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String passwordText = driver.findElement(By.cssSelector("form p")).getText();

		// Please use temporary password 'rahulshettyacademy' to Login.

		String[] passwordArray = passwordText.split("'");

		// String[] passwordArray2 = passwordArray[1].split("'");

		// passwordArray2[0]

		//String password = passwordArray[1].split("'")[0];
		String password = passwordArray[1];

		return password;

		// 0th index - Please use temporary password

		// 1st index - rahulshettyacademy' to Login.

		// 0th index - rahulshettyacademy

		// 1st index - to Login.

	}

}
