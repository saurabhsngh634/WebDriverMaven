package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Seetestng {
	
	@AfterTest
	public void closeDBconn()
	{
	    System.out.println("Closing connection with DB");
	}
	
	@BeforeMethod
	public void launch()
	{
	    System.out.println("Lauching browser");
	}
	@BeforeTest
	public void createDBconn()
	{
	    System.out.println("Establishing connection with DB");
	}
	
	@AfterMethod
	public void ClosingBrowser()
	{
	    System.out.println("Closing browser");
	}
	
	@Test(priority=2)
	public void doLogin()
	{
	    System.out.println("Executing login test");
	}
	@Test(priority=1)
	public void doRegister(){
		System.out.println("Executing register method");
	}
	
	

}
