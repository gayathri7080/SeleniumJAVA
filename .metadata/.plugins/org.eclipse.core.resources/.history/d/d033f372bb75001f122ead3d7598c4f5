package assignmentpracticeudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assg6_alert_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//check box
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		//for dropdown variable crateion
		String checktext = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement w =driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select dropdown = new Select(w);
		dropdown.selectByVisibleText(checktext);
		driver.findElement(By.cssSelector("#name")).sendKeys(checktext);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		if (alerttext.contains(checktext)) 
		{
			System.out.println("alert msg success");
		}
		else 
		{
			System.out.println("something went wrong");
		}
		
		

	}

}
