package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void demo() {
		System.out.println("Demo class");
		Assert.assertTrue(false);
		
	}

	@Test
	public void secondTest() {
		System.out.println("second func()");
		
		
	}
	@Test(groups= {"smoke"})
	public void thirdTest() {
		System.out.println("thirdTest func()");
		
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println(" i will execute before test ");
	}

	

}
