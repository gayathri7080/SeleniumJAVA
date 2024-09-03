package assignmentpracticeudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.findElement(By.xpath("//label[text()='Name']")).getText(), "Name");
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Gayathri");
		Assert.assertFalse(driver.findElement(By.cssSelector("#exampleCheck1")).isSelected());
		driver.findElement(By.cssSelector("#exampleCheck1")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("#exampleCheck1")).isEnabled());
		//dropdown
		driver.findElement(By.cssSelector("#exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//option[text()='Female']")).click();
		
		
		

	}

}
