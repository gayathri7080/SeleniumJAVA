package javaPracticeUdemy;

import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionaltestingecommercw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] itemsNeeded = { "Cucumber", "Beetroot", "Carrot", "Beans" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		List<WebElement> veggies = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < veggies.size(); i++)
		{
			String[] name = veggies.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// convert array to array list for easy search
			// check whether anem u extracted is present in ur arraylist or not

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) 
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
				{
					break;
				}
			}
		}
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.cssSelector("div[class='cart-preview active'] button[type='button']")).click();

	}

}