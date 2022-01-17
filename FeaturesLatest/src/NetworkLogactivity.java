import java.util.Optional;

import org.asynchttpclient.Request;
import org.asynchttpclient.Response;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v95.network.Network;

public class NetworkLogactivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devtools.addListener(Network.requestWillBeSent(), request -> {
			Request req = request.getRequest();
			System.out.println(req.getUrl());
		});

		devtools.addListener(Network.responseReceived(), response -> {
			Response res = response.getResponse();
			System.out.println(res.getStatusCode());
		});

		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector("a[routerlink*='library']")).click();

	}

}
