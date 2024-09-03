package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders
{
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	
		Thread.sleep(1000);
		boolean status = driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isDisplayed();
		if (status == true)
		{
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}

	}
	
	@AfterClass
	void tearDown()
	{
		
		//driver.close();
	}
	
	
	
//DataProviders : data providers are used to supply test data to your test methods. 
	//This is particularly useful for running the same test multiple times with different data sets
	@DataProvider(name="dp" , indices= {0,2,3})
	Object [][] loginData()
	{
		
		Object data[][] = {
				{"abc@gmail.com" , "test"},
				{"wer@gmail.com" , "test"},
				{"pavanol123@gmail.com" , "test@123"},
				{"abc1231231@gmail.com" , "tes5765t"}
	
		};
		return data;
		
	}
}
