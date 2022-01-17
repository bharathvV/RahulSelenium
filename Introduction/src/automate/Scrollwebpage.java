package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.*;

public class Scrollwebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=6000");
		WebElement tbrows_subdriver= driver.findElement(By.cssSelector("div[class='tableFixHead'] table[id='product'] tbody "));
		List<WebElement> values= tbrows_subdriver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
		      	sum=sum+Integer.parseInt(values.get(i).getText());
		}
		String total_amount=driver.findElement(By.cssSelector("fieldset .totalAmount")).getText();
		System.out.println(total_amount.split(":")[1].trim());
		Assert.assertEquals(sum,Integer.parseInt(total_amount.split(":")[1].trim()));
		
	}

}
