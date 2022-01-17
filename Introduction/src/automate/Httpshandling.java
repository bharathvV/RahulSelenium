package automate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Httpshandling {

	public static void main(String[] args) {
		
		
		//setting up local browser settings
		ChromeOptions options = new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		//integrating the options with chrome driver
		WebDriver driver = new ChromeDriver(options);

	}

}
