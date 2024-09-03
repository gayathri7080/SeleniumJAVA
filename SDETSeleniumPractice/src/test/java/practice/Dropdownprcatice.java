package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdownprcatice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		 WebElement amt1 = driver.findElement(By.cssSelector("#mat-input-0"));
	        amt1.clear();
	        amt1.sendKeys("100");
	        WebElement mnths1 = driver.findElement(By.cssSelector("#mat-input-1"));
	        mnths1.clear();
	        mnths1.sendKeys("20");
	        WebElement intrst1 = driver.findElement(By.cssSelector("#mat-input-2"));
	        intrst1.clear();
	        intrst1.sendKeys("5");

	        driver.findElement(By.cssSelector(".mat-select-trigger.ng-tns-c109-4")).click();
	        List<WebElement> dropdownOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//mat-option[@role='option']/span[@class='mat-option-text']")));
	        
	        System.out.println(dropdownOptions.size());
	        for (WebElement option : dropdownOptions) {
	            if (option.getText().trim().equals("Compounded Annually")) {
	                option.click();
	                System.out.println(option.getText());
	                break;
	            }
	        }

	        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")));
	        submitButton.click();
	        
	        WebElement totalValue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#displayTotalValue")));
	        System.out.println(totalValue.getText());

	        driver.quit();
	}

}
