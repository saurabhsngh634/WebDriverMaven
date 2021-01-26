package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider="getData")
	public void doLogin(String username, String password){
		System.out.println(username+"-----"+password);
	}
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		data[0][0] = "trainer.way2automation.com";
		data[0][1] = "kjshgd";
		data[1][0] = "saurabh@gmail.com";
		data[1][1] = "kjshgd";
		data[2][0] = "saurabh@yahoo.com";
		data[2][1] = "kjshgd";
		
		return data;
				
	}
	

}
