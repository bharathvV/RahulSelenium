package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day3 {
    
	
	@Test(groups= {"smoke"})
	public void webloginhomeloan() {
		System.out.println("web homelogin");
		
		
	}

	@Parameters({"URLattest1"})
	@Test
	public void Mobilehomeloan(String urlname) {
		System.out.println("mobile homelogin");
		System.out.println(urlname);
		
	}

	
	//for every run this get data will repeat that number of times okay dont ocnfuse
	@Test(dataProvider="getData")
	public void homeloanApi(String username, String password) {
		System.out.println("Api homelogin");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println(" i will execute after test ");
	}
	@BeforeSuite
	public void aftersuite() {
		System.out.println("i will execute first suite in day 3");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("i will execute after every method execution for this class only in day 3");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("i will execute before every method execution for this class only in day 3");
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
	    data[0][0]="firstUsername";
	    data[0][1]="firstPass";
	    
	    data[1][0]="secondUsername";
	    data[1][1]="secPass";
	    
	    data[2][0]="thirdUsername";
	    data[2][1]="thirdPass";
	    
	    return data;
		
	}
	
	
    

}
