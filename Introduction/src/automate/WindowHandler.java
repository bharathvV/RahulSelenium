package automate;

import java.util.Set;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentId=it.next();
		System.out.println(parentId);
		String childId=it.next();
		driver.switchTo().window(childId);
	    String mailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split(" ")[4];
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(mailId);

	}

}
