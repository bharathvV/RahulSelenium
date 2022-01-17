package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLogin {

	WebDriver driver;
	By username = By.id("login1");
	By password = By.id("password");
	By signinbtn = By.cssSelector("input[title='Sign in']");
	By homepagebtn=By.xpath("//a[contains(text(),'rediff.com')]");

	public RediffLogin(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement email() {
		return driver.findElement(username);
	}

	public WebElement password() {
		return driver.findElement(password);
	}

	public WebElement submit() {
		return driver.findElement(signinbtn);
	}
	public WebElement home(){
		return driver.findElement(homepagebtn);
	}
	

}
