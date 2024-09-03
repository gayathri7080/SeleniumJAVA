package javaPracticeUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseinteractions86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector(".icp-nav-link-inner .nav-line-2"))).build().perform();
	//	a.moveToElement(driver.findElement(By.cssSelector("#nav-search-bar-form"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		a.moveToElement(driver.findElement(By.xpath("//a[text()='Mobiles']"))).contextClick().build().perform();
		
				
	}

}
