package practice;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javaPracticeUdemy.ExcelUtils;

public class ExcelCitibankCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		driver.manage().window().maximize();
		String filePath = System.getProperty("user.dir")+"\\testData\\CitibankCalci.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		try {
		for (int i = 1; i <= rows; i++)
		{
			//Read data from excel file i.e.CitibankCalci.xlsx which is in test Data folder
			String amt = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String mnths = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String intrst = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String compdng = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String exp_matur = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			exp_matur.replace(",", "");
			//pass above data into application
			
			WebElement amt1 = driver.findElement(By.cssSelector("#mat-input-0"));
			amt1.clear();
			amt1.sendKeys(amt);
			WebElement mnths1 = driver.findElement(By.cssSelector("#mat-input-1"));
			mnths1.clear();
			mnths1.sendKeys(mnths);
			WebElement intrst1 = driver.findElement(By.cssSelector("#mat-input-2"));
			intrst1.clear();
			intrst1.sendKeys(intrst);

	        driver.findElement(By.cssSelector(".mat-select-trigger.ng-tns-c109-4")).click();
	        List<WebElement> dropdownOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//mat-option[@role='option']/span[@class='mat-option-text']")));
	        
			   for (WebElement option : dropdownOptions) {
	                if (option.getText().equals(compdng)) {
	           //     	option.clear();
	                    option.click();
	                    break;
	                }
	            }
			  
			   WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']")));
		        submitButton.click();
			Thread.sleep(100);
			String actual_matur1 = driver.findElement(By.cssSelector("#displayTotalValue")).getText();
			String actual_matur  = actual_matur1.trim().substring(1).replace(",", "");
			System.out.println(actual_matur);
			//Validation excel maturity value should match with the website calculated value
	            
			if (Float.parseFloat(actual_matur) == Float.parseFloat(exp_matur))
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 6, "Passed");
				
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 6, "Failed");
			}
			
		}
		}
		catch (NoSuchWindowException e) {
            System.out.println("The target window is already closed: " + e.getMessage());
        }
		
	

	}

}
