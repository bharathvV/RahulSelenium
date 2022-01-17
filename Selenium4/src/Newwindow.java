import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> tabsids= handles.iterator();
		String parentId=tabsids.next();
		String childId=tabsids.next();
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com/");
		String firstCourseTitle=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentId);
		WebElement textbox=driver.findElement(By.cssSelector("[name='name']"));
		textbox.sendKeys(firstCourseTitle);
		File srcfile=textbox.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("logo.png"));
		System.out.println(textbox.getRect().getDimension().getHeight());
		System.out.println(textbox.getRect().getDimension().getWidth());
	}

}
