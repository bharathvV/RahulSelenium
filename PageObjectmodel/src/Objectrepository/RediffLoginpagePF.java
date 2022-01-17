package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {
	//Pagefactory class implementation by using this @Findby annotation understand carefully

	WebDriver driver;
	public RediffLoginpagePF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	By username = By.id("login1");
//	By password = By.id("password");
//	By signinbtn = By.cssSelector("input[title='Sign in']");
//	By homepagebtn=By.xpath("//a[contains(text(),'rediff.com')]");

	 @FindBy(xpath="//a[contains(text(),'rediff.com')]")
	 WebElement homepagebtn;
	 
	 @FindBy(css="input[title='Sign in']")
	 WebElement signinbtn;
	 
	 @FindBy(id="password")
	 WebElement password;
	 
	 @FindBy(id="login1")
	 WebElement username;
	
	public WebElement email() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement submit() {
		return signinbtn;
	}
	public WebElement home(){
		return homepagebtn;
	}
	

}
