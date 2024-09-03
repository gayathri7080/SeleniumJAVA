package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class airIndiaDatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		String date = "11";
		String month = "Feb";
		String year ="2025";
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#appoinmentdate")).click();
		Thread.sleep(100);
		WebElement yDrop=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select yyDrop = new Select(yDrop);
		yyDrop.selectByValue(year);
		Thread.sleep(100);
		WebElement mDrop = driver.findElement(By.cssSelector(".ui-datepicker-month"));
		Select mmDrop = new Select(mDrop);
		mmDrop.selectByVisibleText(month);
		 driver.findElement(By.xpath("//a[@data-date="+date+"]")).click();
		
		
		
		

	}

}
