package practice;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IndexOf_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		try {
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".btn-primary")).click();
		//Thread.sleep(6000);
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		
         WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/nav[1]/ul[1]/li[6]")));
         element.click();
         // Interact with the element
		
			driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		String text =	driver.findElement(By.xpath("//div[contains(text(),\"Pages\")]")).getText();
			int totalpages= Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1 ));
	
			System.out.println(totalpages);
			
			for (int r = 0; r < 5; r++) 
			{
				if(r>1)
				{
				    // Locate the element
			        WebElement element1 = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()='2']"));

			        // Scroll to the element
			        JavascriptExecutor js = (JavascriptExecutor) driver;
			        js.executeScript("arguments[0].scrollIntoView(true);", element1);
			        element1.click();
			//		driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+r+"]")).click();
				}
			}
		} 
		catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
        }
		


	}

}
