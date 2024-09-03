package practice;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//getting the pagination number
		int pagno = driver.findElements(By.cssSelector("#pagination li")).size();
		System.out.println(pagno);
		//click on each pagination number
		for (int p = 1; p <= pagno; p++)
		{
			driver.findElement(By.xpath("//ul[@id='pagination']//*[text()="+p+"]")).click();
			int noOfRows = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr")).size();
			for (int r = 1; r <= noOfRows; r++) 
			{
				String Name = driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[2]")).getText();
				String Price = driver.findElement(By.xpath("//table[@id='productTable']//tbody/tr["+r+"]/td[3]")).getText();
				System.out.println(Name + "\t" + Price);
			}
			
		}
	}

}
