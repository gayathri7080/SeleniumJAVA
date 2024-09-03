package javaPracticeUdemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ParseString43 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String name = "rahul";
		String finalpwd1 = getPassword(driver);

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);

		driver.findElement(By.name("inputPassword")).sendKeys(finalpwd1);

		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("p")).getText());

		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

		driver.findElement(By.xpath("//*[text()='Log Out']")).click();

	}
public static String getPassword(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
	 	driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div button:nth-child(2)")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordarray = passwordText.split("'");
		//passwordarray[0] = Please use temporary password ,
		//passwordarray[1] = rahulshettyacademy' to Login.
		String finalpwd = passwordarray[1].split("'")[0];
		//finalpwd[0] = rahulshettyacademy
		//finalpwd[1] = to Login.
		return finalpwd;
		}
	

}
