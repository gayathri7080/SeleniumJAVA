package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute_tagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://academy.capgemini.nl/");
		List<WebElement> linktag = driver.findElements(By.tagName("a"));
		for (WebElement links : linktag)
		{
			String urls = links.getAttribute("href");
			System.out.println(urls);
		
		}
		
	}
}

