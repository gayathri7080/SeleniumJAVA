package javaPracticeUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertionsadding {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\ggoritya\\OneDrive - Capgemini\\Documents\\Selenium web drivers\\edgedriver_win64\\msedgedriver.exe");
	//	WebDriver driver =  new EdgeDriver();
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ggoritya\\OneDrive - Capgemini\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("158r1a0480@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.cssSelector("button.logout-btn")).getText());
		System.out.println(driver.findElement(By.xpath("(//body/div/div/div/div/h2)")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("button.logout-btn")).getText(), "LOG OUT");
	
	}

}
