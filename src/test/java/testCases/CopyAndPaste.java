package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyAndPaste {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("saurabh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div")).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.CONTROL + "A")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL + "C")).perform();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL + "V")).perform();

	}

}
