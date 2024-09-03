package javaPracticeUdemy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinksSeparatetabs95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println("all the links in page are " +driver.findElements(By.tagName("a")).size());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//print all the links of page
		  for (int i = 0; i < links.size(); i++)
		  {
			System.out.println(links.get(i).getText());
		  }
		  //only footer links
		  WebElement footdriver = driver.findElement(By.cssSelector(".gf-t"));
		  System.out.println("Complete footers links size is " + footdriver.findElements(By.tagName("a")).size());
		  //first footer links
		  WebElement footdriver1 = driver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		  System.out.println("1st  footer block links size is " +footdriver1.findElements(By.tagName("a")).size());
		  //click on eat link in first footer 
		  for (int i = 0; i < footdriver1.findElements(By.tagName("a")).size(); i++)
		  {
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footdriver1.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
		  }
	}

}
