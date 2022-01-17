package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class day4 {
	
//	@Parameters({"URLattest2"})
	@Test(groups= {"smoke"})
	public void weblogincarloan(String urlname) {
		System.out.println("web carloan");
		System.out.println(urlname);
	}

	@Test(timeOut=4000)  //waits till 40 seconds
	public void Mobilecarloan() {
		System.out.println("mobile carloan");
	}
	
	@Test
	public void Mobilesignloan() {
		System.out.println("mobile signin");
	}
	@Test(enabled=false)
	public void Mobilesignoutloan() {
		System.out.println("mobile signout");
	}
	

	@Test(dependsOnMethods= {"weblogincarloan"})
	public void carloanApi() {
		System.out.println("Api carloan");
	}
    
	@AfterSuite
	public void aftersuite() {
		System.out.println("i will execute last suite in day 4");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("this test method will exec before all the methods  for this particular class only in day 4");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("this test method will exec after all the methods  for this particular class only in day 4");
	}

}
