  //most important easy okay dont confuse
package automate;

import java.util.*;
import java.util.Iterator;


import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

   
public class TestingAll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//telling the driver to search links only in footer area of web page i,
		//limiting web driver scope
 		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//footer page restricted to only one particular column in the footer page ok understadn the path
		WebElement footerpagedriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerpagedriver.findElements(By.tagName("a")).size());
		
		int no_of_links=footerpagedriver.findElements(By.tagName("a")).size();
		
		//to open all links in new tabs we have to use footerd river scopeto continue this scope
		for(int i=1;i<no_of_links;i++) {
		 	footerpagedriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		 	Thread.sleep(5000);
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		System.out.print(windows.size());
		for(int i=1;i<windows.size();i++) {
			  String childId=it.next();
			  driver.switchTo().window(childId);
			  System.out.println(driver.getTitle());
	    }
	}

}
