import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemoGrocery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> webelemes = driver.findElements(By.xpath("//tr/td[1]"));
//		webelemes.stream().map(e->e.getText()).forEach(e->System.out.println(e));
		List<String> originallist = webelemes.stream().map(e -> e.getText()).collect(Collectors.toList());
		List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(originallist.equals(sortedlist));
		
		
		//print the price of any dynamic vegie price value that is given ok don't confuse
		List<String> price;
		do {
			List<WebElement> webelemes1 = driver.findElements(By.xpath("//tr/td[1]"));
			// print the price of the veg name i,e print the price of Bean i,e is it is
			// followinf sibling web table understand it ok
			price = webelemes1.stream().filter(s -> s.getText().contains("Pineapple")).map(e -> getPriceofVeggie(e))
					.collect(Collectors.toList());
			price.forEach(ele -> System.out.println(ele));
			
			if (price.size() < 1) {
				System.out.println(price.size());
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
		
	}
	
	// print the price of the veg name i,e print the price of Bean i,e is it is
	// followinf sibling web table understand it ok

	private static String getPriceofVeggie(WebElement s) {
		System.out.println(s);
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		// TODO Auto-generated method stub
		return price;
	}

}
