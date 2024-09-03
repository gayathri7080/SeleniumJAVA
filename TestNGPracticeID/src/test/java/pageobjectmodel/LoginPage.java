package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	//Constructor
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//Locators
	By username_loc = By.xpath("//input[@placeholder='Username']");
	By pwd_loc = (By.xpath("//input[@placeholder='Password']"));
	By loginbtn_loc = (By.xpath("//button[normalize-space()='Login']"));
	
	//Action Methods
	public void setUsername(String user)
	{
		driver.findElement(username_loc).sendKeys(user);
	}
	
	public void setPwd(String pwd)
	{
		driver.findElement(pwd_loc).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(loginbtn_loc).click();
	}
}
