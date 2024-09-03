package assignmentpracticeudemy;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assgmt7_WebTables {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().deleteAllCookies();
		WebElement mtable = driver.findElement(By.cssSelector("#product"));
		//scroll the page page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		//scroll the table to bottom in page
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		System.out.println(driver.findElements(By.cssSelector("#product:nth-child(2) tr")).size());
		System.out.println(driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']/tbody/tr/th")).size());
		System.out.println(driver.findElement(By.cssSelector("#product:nth-child(2) tr:nth-child(3)")).getText());
		List<WebElement> rows = mtable.findElements(By.cssSelector("tr:nth-child(3) td"));
		for (int i = 0; i < rows.size(); i++)
		{
			System.out.println(rows.get(i).getText());
		}
	}
}
