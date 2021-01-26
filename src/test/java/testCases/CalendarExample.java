package testCases;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarExample {
	static int targetDay = 0, targetMonth = 0, targetYear = 0;
	static int currentDay = 0, currentMonth = 0, currentYear = 0;
	static int jumpMonthsBy=0;
	static boolean increment = true;

	public static void main(String[] args) throws InterruptedException {
    String dateToSet="16/12/2020";
    
    getCurrentDateMonthAndYear();
    System.out.println(currentDay+"/"+currentMonth+"/"+currentYear);
    
    getTargetDateMonthAndYear(dateToSet);
    System.out.println(targetDay+"/"+targetMonth+"/"+targetYear);
    
    calculateHowManyMonthsToJump();
    System.out.println(jumpMonthsBy);
    System.out.println(increment);
    
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement ele  = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(ele);
	driver.findElement(By.id("datepicker")).click();
		for(int i=0; i<jumpMonthsBy;i++){
		
		if(increment){
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			
		}else{
			
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
			
		}
		
		Thread.sleep(1000);
		
	}

	driver.findElement(By.linkText(Integer.toString(targetDay))).click();
	}

	public static void getTargetDateMonthAndYear(String dateString) {
		int firstIndex = dateString.indexOf("/");
		int lastIndex = dateString.lastIndexOf("/");
		
		String day = dateString.substring(0, firstIndex);
		targetDay = Integer.parseInt(day);
		
		
		String month = dateString.substring(firstIndex+1, lastIndex);
		targetMonth = Integer.parseInt(month);
		
		
		String year = dateString.substring(lastIndex+1, dateString.length());
		targetYear = Integer.parseInt(year);
	}
	
public static void calculateHowManyMonthsToJump(){
		
		if((targetMonth-currentMonth)>0){
			
			jumpMonthsBy = (targetMonth-currentMonth);
		}else{
			
			jumpMonthsBy = (currentMonth-targetMonth);
			increment = false;
		}
}
	public static void getCurrentDateMonthAndYear()
	{
		
		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
	}
}
