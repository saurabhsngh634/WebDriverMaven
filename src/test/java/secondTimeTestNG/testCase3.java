package secondTimeTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testCase3 {
	
	@Test(priority=1,groups={"functional","smoke"})
	public void doRegister()
	{
		System.out.println("Executing register method");
		Assert.fail("User not registered successfully ");
	}
	
	
	@Test(priority=2,dependsOnMethods="doRegister",groups= {"functional","smoke"})
	public void doLogin()
	{
		System.out.println("Executing login method");
	}
	
	
    @Test(priority=3,dependsOnMethods="doRegister",alwaysRun=true,groups={"functional","smoke"})
	public void thirdTest()
	{
		System.out.println("Executing third method");
	}
    
    
    @Test(priority=4,dependsOnMethods="doRegister",groups="UAT")
	public void forthTest()
	{
		System.out.println("Executing forth method");
	}
}
