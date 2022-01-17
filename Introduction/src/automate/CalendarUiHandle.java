package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class CalendarUiHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		// code related to selecting specific date in the current month
		driver.findElement(By.id("travel_date")).click();
		
		
		//code to select april month from the gieven months be careful aply mind
		//there can be many ways think ok best solution
		//// code related to selecting specific year from calendar icon
		//this css selector path search that class in the specified parent
		//important understand carefully ok dont confuse easy
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		int no_of_days = days.size();
		for (int i = 0; i < no_of_days; i++) {
			String day_text = driver.findElements(By.className("day")).get(i).getText();
			if (day_text.equalsIgnoreCase("22")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
		
		
	}

}
