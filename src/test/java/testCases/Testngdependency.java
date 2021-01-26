package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testngdependency {
	
	@Test
	public void doRegister(){
		System.out.println("Register");
		Assert.fail("failing this");
	}
	
	@Test(dependsOnMethods="doRegister")
	public void Login(){
		System.out.println("Login");
	}

}
