import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;



 //this way appears in selenum 4.0 version where we can find the preceding or subcedign element with selenium 4 version ok  with(By.tagname().above()) and some extra static package above there ok dont condufse easy
// i,e we generally use parent and chikld and sibling relationsip ok don't confuse ok easy
public class RemoteLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameInput=driver.findElement(By.cssSelector("[name='name']"));
		String labeltext=driver.findElement(with(By.tagName("label")).above(nameInput)).getText();
	    System.out.println(labeltext);
	    WebElement dob =driver.findElement(By.cssSelector("label[for='dateofBirth']"));
	    driver.findElement(with(By.tagName("input")).below(dob)).click();
	    
	    WebElement icecream=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
//	    driver.findElement(with(By.tagName("input")).toLeftOf(icecream)).click();
	    driver.findElement(with(By.tagName("input")).toLeftOf(icecream)).click();
	    WebElement radio1= driver.findElement(By.id("inlineRadio1"));
	    
	    System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radio1)).getText());
	}

}
