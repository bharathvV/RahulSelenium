package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHome {

	WebDriver driver;
	By searchinput = By.id("srchword");
	By searchbtn = By.xpath("//form[@id='queryTop']/input");

	public RediffHome(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement searchinput() {
		return driver.findElement(searchinput);
	}
	public WebElement searchsubmit() {
		return driver.findElement(searchbtn);
	}

}
