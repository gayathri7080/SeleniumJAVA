package practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionaltesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Potato", "Beetroot", "Carrot", "Beans" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		List<WebElement> veggies = driver.findElements(By.cssSelector(".product-name"));
		for (int i = 0; i < veggies.size(); i++) 
		{
			System.out.println(veggies.get(i).getText());
			String veggiename = veggies.get(i).getText().split("-")[0].trim();
			System.out.println(veggiename);
			
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(veggiename)) 
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
	
		
	}

}
