package parallelbrowsertesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {

	WebDriver driver;
	
	@BeforeClass 
	@Parameters ({"browser"})
	void setUp(String br) 
	{
		switch(br)
		{
		case "chrome" : driver = new ChromeDriver();
		break;
		
		case "edge" : driver = new EdgeDriver();
		break;
		
		default: System.out.println("Inavlid browser");
		
		}
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
	}
	
	@Test
	void accountTest()
	{
		boolean status = driver.findElement(By.xpath("//span[normalize-space()='My Account']")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	
	@Test
	void LogoTest()
	{
		boolean logoStatus = driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']")).isDisplayed();
		Assert.assertEquals(logoStatus, true);
	}
	
}
