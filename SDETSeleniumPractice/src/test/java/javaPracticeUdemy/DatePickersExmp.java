package javaPracticeUdemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickersExmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.findElement(By.cssSelector("#datepicker")).click();
		String year = "2024";
		String month = "May";
		String date = "20";
		
		selectPastDate(driver,year,month,date);
		
		
	}

	public static void selectPastDate(WebDriver driver, String year, String month, String date) {
		// TODO Auto-generated method stub
		
		while(true) 
		{
			String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
			String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
			
			if (year.equals(currentYear) && month.equals(currentMonth)) 
			{
				break;
			}
			driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-w")).click();
		}
		
		List<WebElement> allDates = driver.findElements(By.xpath("//td/a"));
		for (WebElement dt : allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
	}

}
