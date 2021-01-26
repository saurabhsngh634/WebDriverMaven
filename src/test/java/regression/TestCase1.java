package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void doLogin()
	{
		System.out.println("Executing login method");
	}
    @Test
	public void doRegister()
	{
		System.out.println("Executing register method");
	}
    @BeforeTest
	public void madeDBconn()
	{
		System.out.println("made db connection");
	}
    @AfterTest
	public void lossdbconn()
	{
		System.out.println("loss db connection");
	}
    @BeforeMethod
	public void launchBrowser()
	{
		System.out.println("launching browser");
	}
    @AfterMethod
	public void closeBrowser()
	{
		System.out.println("closing browser");
	}
}
