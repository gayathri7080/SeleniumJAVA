package javaPracticeUdemy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks110 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//to get URL of some linked text
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		System.out.println(url);
	
		
		List<WebElement> links = driver.findElements(By.xpath("//li"));
		for (int i = 0; i < links.size(); i++)
		{
			System.out.println(links.get(i).getText());
		}
	
		
		HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();//open connection to the server
//		con.setRequestMethod("HEAD");
		con.connect();//connect request to server
		int rescode = con.getResponseCode();
		System.out.println(rescode);
		


	}

}
