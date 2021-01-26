package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_listeners {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver webdriver = new ChromeDriver();

		EventFiringWebDriver driver = new EventFiringWebDriver(webdriver);

		WebDriverListeners listner = new WebDriverListeners();

		driver.register(listner);

		driver.navigate().to("http://google.com");

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]")).click();

		Thread.sleep(2000L);

		driver.navigate().back();

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("dog");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		Thread.sleep(2000L);

		driver.navigate().back();

		Thread.sleep(2000L);

		driver.navigate().forward();

	}

}
