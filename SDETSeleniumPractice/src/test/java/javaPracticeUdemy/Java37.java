package javaPracticeUdemy;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import dev.failsafe.internal.util.Assert;

public class Java37 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.edge.driver", "C:\\Users\\ggoritya\\OneDrive - Capgemini\\Documents\\Selenium web drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver =  new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("158r1a0480@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.cssSelector("button.logout-btn")).getText());
		System.out.println(driver.findElement(By.xpath("(//body/div/div/div/div/h2)")).getText());
		assertEquals(driver.findElement(By.cssSelector("button.logout-btn")).getText(),"LOG OUT");
	
		
	
	}

}
