package secondTimeTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test(groups="smoke")
	public void validateTitles() {
		SoftAssert softassert = new SoftAssert();
		System.out.println("beginning");
		String actual_Title = "yahoo.com";
		String expected_Title = "gmail.com";
		System.out.println("Validating title ");
		//Assert.assertEquals(actual_Title, expected_Title );
		//Assert.assertTrue(false,"element not found");
		softassert.assertEquals(actual_Title, expected_Title );
		softassert.assertTrue(false,"element not found");
		//Assert.fail("failing due to error");
		System.out.println("Validating Image");
		softassert.assertEquals(true, false, "Image not present" );
		System.out.println("Validating textbox");
		softassert.assertEquals(true, false, "textbox not present" );
		System.out.println("ending");
		
		softassert.assertAll();
		
	}
}
