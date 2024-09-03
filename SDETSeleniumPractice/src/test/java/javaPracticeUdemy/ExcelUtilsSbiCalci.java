package javaPracticeUdemy;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelUtilsSbiCalci {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='wzrk-button-container']//button[1]")).click();
		
		String filePath = System.getProperty("user.dir")+"\\testData\\SimpleInterestCalci.xlsx";
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		for (int i = 1; i <= rows; i++)
		{
			//Read data from excel file i.e.SimpleInterestCalci.xlsx which is in test Data folder
			String Princi = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String ROI = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String per1 = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String per2 = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String freq = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			String exp_matur = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			
			//pass above data into application
			driver.findElement(By.cssSelector("#principal")).sendKeys(Princi);
			driver.findElement(By.cssSelector("#interest")).sendKeys(ROI);
			driver.findElement(By.cssSelector("#tenure")).sendKeys(per1);
			Select perioddrop = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perioddrop.selectByValue(per2);
			//perioddrop.selectByVisibleText(per2);
			Select freqdrop = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freqdrop.selectByVisibleText(freq);
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[1]")).click();
			
			//Validation excel maturity value should match with the website calculated value
			String actul_matur = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			if (Double.parseDouble(actul_matur) == Double.parseDouble(exp_matur)) 
			{
				System.out.println("Test Passed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
				
			}
			else
			{
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
			}
			
			driver.findElement(By.xpath("//div[@class='CTR PT15']//a[2]")).click();
			
		
			
		}
		
		
		driver.quit();

	}

}
