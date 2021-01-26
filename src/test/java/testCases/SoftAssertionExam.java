package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExam {
	
	
	@Test
	public void validateTitles()
	{
		System.out.println("starting");
		
		String expected_title = "yahoo.com";
		String actual_title = "gmail.com";
		
		SoftAssert softassert = new SoftAssert();
		softassert.fail("Failing the test as condition is not met");
		
		
		softassert.assertEquals(actual_title, expected_title);
		//AssertTrue checks whether the condition is true or not
		//Assert.assertTrue(false);
		//Forcefully fail the testcase
		
		System.out.println("ending");
		
		softassert.assertAll();
		
		//in this code assertequals fails so assert.fail
		//will not be executed. So to make assert.fail executable
		//we need to use soft assertions
	}

}
