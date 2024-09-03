package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetDatePicker {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		String requiredDate = "11";
		String requiredMonth = "February";
		String requiredYear ="2025";
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")).click();
		
		WebElement selectDate = driver.findElement(By.xpath("//div[contains(@data-testid,'month-"+requiredMonth+"-"+requiredYear+"')]//div[@data-testid='undefined-calendar-day-"+requiredDate+"']/div/div"));
		selectDate.click();
	
	/*	List<WebElement> allMonthYear= driver.findElements(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79'])"));
		for (WebElement MY : allMonthYear) 
		{
			System.out.println(MY.getText());
			if (MY.getText().equals(requiredMonthYear))
			{

				List<WebElement> allDates = MY.findElements(By.cssSelector(".css-76zvg2.r-homxoj.r-ubezar.r-16dba41"));
				for (WebElement dt : allDates) 
				{
					if (dt.getText().equals(requiredDate))
					{
						dt.click();
						System.out.println(dt.getText());
						Thread.sleep(100);
						break;
					}
				}
				
				break;
				
			}
			else 
			{
				driver.findElement(By.cssSelector(".r-1loqt21.r-u8s1d.r-11xbo3g.r-1v2oles")).click();
			}
			
		}  */
	
		
		
			
		

	}

}
