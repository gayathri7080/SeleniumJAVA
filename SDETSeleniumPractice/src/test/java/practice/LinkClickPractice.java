package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
public class LinkClickPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the test automation practice blog
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();
            // Locate the search box
            WebElement searchBox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));

            // Enter the search query and press Enter
            searchBox.sendKeys("selenium");
            searchBox.sendKeys(Keys.ENTER);

            // Wait for the search results to load
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wikipedia-search-result-link")));
            
        

            // Locate the search results
            List<WebElement> searchResults = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));
           System.out.println(searchResults.size());

            // Iterate over the search results and print the titles and URLs
            for (WebElement result : searchResults) {
                // Extract the title
                String title = result.getText();

                // Extract the URL
                String url = result.getAttribute("href");

                // Print the title and URL
                System.out.println("Title: " + title);
                System.out.println("URL: " + url);
                
        //       result.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
               result.click();
              
            }

        } catch(Exception E) {
            // Close the browser
            Exception E1;
        }
	}

}
