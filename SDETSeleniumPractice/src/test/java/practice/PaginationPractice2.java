package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		int rowsNo = driver.findElements(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-card']")).size();
		System.out.println(rowsNo);
		for (int r = 1; r <rowsNo; r++) 
		{
			String userName = driver.findElement(By.xpath("//div[@class='oxd-table-card']["+r+"]/div/div[@role='cell'][2]")).getText();
			String userRole = driver.findElement(By.xpath("//div[@class='oxd-table-card']["+r+"]/div/div[@role='cell'][3]")).getText();
			String status =  driver.findElement(By.xpath("//div[@class='oxd-table-card']["+r+"]/div/div[@role='cell'][5]")).getText();
			System.out.println(userName + "\t" +userRole + "\t" + status);
		}
		
	}

}
