package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionbasic {
	
	@Test
	public void validateTitles()
	{
		String expected_title = "yahoo.com";
		String actual_title = "gmail.com";
		Assert.assertEquals(actual_title, expected_title);
		//AssertTrue checks whether the condition is true or not
		//Assert.assertTrue(false);
		//Forcefully fail the testcase
		Assert.fail("Failing the test as condition is not met");
		
		//in this code assertequals fails so assert.fail
		//will not be executed. So to make assert.fail executable
		//we need to use soft assertions
	}

}
