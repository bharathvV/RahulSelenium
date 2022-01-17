package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assessment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		String labelText=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
		System.out.println(labelText);
		
		Select dropDown=new Select(driver.findElement(By.id("dropdown-class-example")));
		dropDown.selectByVisibleText(labelText);
		driver.findElement(By.id("name")).sendKeys(labelText);
		driver.findElement(By.id("alertbtn")).click();
		String alertText=driver.switchTo().alert().getText();
		String[] splittedtext=  alertText.split(",");
		Assert.assertEquals(splittedtext[0].split(" ")[1], labelText);
		
		

	}

}
