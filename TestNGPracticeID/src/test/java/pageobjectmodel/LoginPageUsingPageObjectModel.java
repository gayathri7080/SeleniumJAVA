package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUsingPageObjectModel {
	WebDriver driver;
	
	
	LoginPageUsingPageObjectModel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	//By username_loc = By.xpath("//input[@placeholder='Username']");
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username_loc;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement pwd_loc;
	@FindBy(xpath="//button[normalize-space()='Login']") WebElement submit_loc;
	
	//Action Methods
	/*	public void setUsername(String user)
		{
			driver.findElement(username_loc).sendKeys(user);
		}
	*/
	
	public void setUsername(String user)
	{
		username_loc.sendKeys(user);
	}
	
	public void setPwd(String pwd)
	{
		pwd_loc.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		submit_loc.click();
	}
	
	
	
	
	
	
}
