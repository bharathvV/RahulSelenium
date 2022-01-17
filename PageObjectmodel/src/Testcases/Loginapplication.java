package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.RediffHome;
import Objectrepository.RediffLogin;
import Objectrepository.RediffLoginpagePF;

public class Loginapplication {
    
	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpagePF rdf=new RediffLoginpagePF(driver);
		rdf.email().sendKeys("bharat@gmail.com");
		Thread.sleep(3000);
		rdf.password().sendKeys("bharath123@vVsss");
		Thread.sleep(3000);
		rdf.submit().click();
		rdf.home().click();
		RediffHome rdfhome=new RediffHome(driver);
		rdfhome.searchinput().sendKeys("emails");
		rdfhome.searchsubmit().click();
		
		
	}
	
}
