import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

public class SetGeolocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		options.addArguments("start-maximized");

		options.addArguments("test-type");

		options.addArguments("enable-strict-powerful-feature-restrictions");

		options.addArguments("disable-geolocation");

		ChromeDriver driver = new ChromeDriver(options);

		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 17);
		coordinates.put("longitude", 78);
		coordinates.put("accuracy", 1);
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("http://google.com/");
		driver.findElement(By.name("q")).sendKeys("netflix", Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		System.out.println(driver.findElement(By.cssSelector(".our-story-card-text")).getText());
	}

}
