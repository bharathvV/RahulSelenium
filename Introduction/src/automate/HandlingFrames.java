package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.switchTo().frame(0); // findng frame by index better to use 18 line mthod ok
		WebElement draggable=driver.findElement(By.id("draggable"));
		WebElement droppable=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().defaultContent(); //to swicth to parent windwo by default
		
	}

}
