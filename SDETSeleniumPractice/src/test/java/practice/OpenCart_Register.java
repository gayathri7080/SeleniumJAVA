package practice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class OpenCart_Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/register");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		 driver.manage().window().maximize();
		
		WebElement txtFrstname = driver.findElement(By.xpath("//input[@id='input-firstname']"));
		txtFrstname.sendKeys("pe1ha1");
		
		WebElement txtLastname = driver.findElement(By.xpath("//input[@id='input-lastname']"));
		txtLastname.sendKeys("perh1");
		
		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='input-email']"));
		txtEmail.sendKeys("pdhd1@gmail.com");
		
		WebElement txtPwd = driver.findElement(By.xpath("//input[@id='input-password']"));
		txtPwd.sendKeys("phjkm1");


		// Agree to the privacy policy
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement chckdPolicy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='agree']")));
		Actions actions = new Actions(driver);
		actions.moveToElement(chckdPolicy).click().perform();
		
        // Submit the form
   //     driver.findElement(By.cssSelector("button[type='submit']")).click();
   //     WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(500));
	//	WebElement btnContinue = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
		//actions.moveToElement(btnContinue).click().perform();
		
		//sol0
	//	WebElement formElement = driver.findElement(By.tagName("form"));
	//	formElement.submit();
		
		
		
		
		WebElement btnContinue = driver.findElement(By.cssSelector("button[type='submit']"));
	//	WebElement btnContinue = driver.findElement(By.id("form-register"));)
		//sol1
//		System.out.println("jhdas1213");
	//	WebElement btnContinue =	driver.findElement(By.id("form-register"));
		//WebElement submit = btnContinue.findElement(By.tagName("button"));
	
	//	System.out.println("submit"   + submit);
		//submit.click();
//		btnContinue.click();
		
	/*	WebElement
		button = driver.findElement(By.xpath(
		"//form[@id='form-register']//button"));
		Actions actions1 =new Actions
		(driver); actions1.moveToElement(button).click().perform();
	*/	
		//sol3
	//	btnContinue.submit();
		
		//sol4
//		btnContinue.sendKeys(Keys.RETURN);
		
		//sol5
//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	js.executeScript("arguments[0].click;", btnContinue);
		
		//sol6
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait2.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
		
		
		//sol7
/*		Actions actions1 = new Actions(driver);
		for (int i = 0; i < 3; i++) {
		    try {
		        actions1.moveToElement(formElement).click().perform();
		        break;
		    } catch (Exception e) {
		        Thread.sleep(1000); // wait for a second before retrying
		    }
		}
		
	*/	

        // Wait for the confirmation message
/*
        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='content']/h1")));
        
        // Verify the registration was successful
        String actualMessage = confirmationMessage.getText();
        assertEquals("Your Account Has Been Created!", actualMessage);
        System.out.println(actualMessage);
        
        
        

   /*   
   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement chckdPolicy = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='agree']")));
		Actions actions = new Actions(driver);
		actions.moveToElement(chckdPolicy).click().perform();
		

		

		WebElement btnContinue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Continue']")));
	//	actions.moveToElement(btnContinue).click().perform();
		//btnContinue.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click;", btnContinue);
		
		Thread.sleep(500);
		WebElement msgConfirmation = driver.findElement(By.xpath("//div[@id='content']/h1"));
		msgConfirmation.getText();
		System.out.println(	msgConfirmation.getText()); 
		
	//	Assert.assertEquals(msgConfirmation.getText(),"Your Account Has Been Created!");
		
		*/
		
		
	
    
		
		
		
	}

}
