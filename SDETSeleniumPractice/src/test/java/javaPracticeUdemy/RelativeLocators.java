package javaPracticeUdemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.xpath("//legend[normalize-space()='Web Table Fixed header']"));
		driver.findElement(with(By.tagName("input")).above(textbox)).sendKeys("hello");
		
		WebElement checkbox = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
	//	driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		driver.findElement(with(By.tagName("input")).toRightOf(checkbox)).click();
		
	}

}
