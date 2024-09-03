package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Brokenlinks {
public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.outfront.com/");
		driver.manage().window().maximize();
		int noOfBrokenlinks=0;
		List<WebElement> links = driver.findElements(By.xpath("//li/a"));
		for (WebElement i : links) 
		{
			String url = i.getAttribute("href");
			
		try {
				HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
				con.connect();
				int rescode = con.getResponseCode();
				if (con.getResponseCode()>=400)
				{
					System.out.println("URL name is " + url + "and the status code is" +  rescode);	
					noOfBrokenlinks++;
				} else 
				{
					System.out.println("URL name is " + url + "and the status code is" +  rescode);	
				}
			}
			catch (IOException e) {
                System.out.println(url + " is a broken link. Exception: " + e.getMessage());
			}
		
		}
		System.out.println("No of broken links "  + noOfBrokenlinks);
		System.out.println(links.size());

	}

}
