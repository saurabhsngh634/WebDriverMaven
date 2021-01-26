package testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) throws InterruptedException

	{
		// System.setProperty("webdriver.gecko.driver", "C:\\Program Files
		// (x86)\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		// FirefoxDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("saurabhsngh634@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("thakurrajput21");
		driver.findElement(By.id("u_0_b")).click();
		
		
		
	} 
}


