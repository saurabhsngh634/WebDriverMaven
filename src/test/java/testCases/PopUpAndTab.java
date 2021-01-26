package testCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpAndTab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Set<String> winids = driver.getWindowHandles();
		Iterator<String> iterate = winids.iterator();

		String first_window = iterate.next();
		System.out.println("first " + first_window);
		driver.findElement(By.xpath("//button[@class='btn btn-primary login-btn hide-in-mobileApp ng-scope']")).click();
		driver.findElement(By.xpath("//a[@class='btn-default register-url']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"/html/body/div[1]/div/div[2]/div[12]/div[6]/div/div/div/div/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div/div[1]/div/a")))
				.click();

		winids = driver.getWindowHandles();
		iterate = winids.iterator();
		first_window = iterate.next();
		String second_window = iterate.next();
		driver.switchTo().window(second_window);
		System.out.println(driver.getTitle());

	}

}
