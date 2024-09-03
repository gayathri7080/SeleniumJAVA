package javaPracticeUdemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelectDropDown52 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "USD");

		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 0; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("#divpaxinfo")).getText(), "5 Adult");

		//// dynamic dropdown : on search only only we can see the dropdown options,
		// then we should write xpath for click of dropdown first and then xpath for the
		//// dropdown item
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("(//a[@value='HYD'])[1]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
		Thread.sleep(2000);
		// auto suggestive drop down
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//li[@class='ui-menu-item']
		// //a[text()='India']")).click();
		// System.out.println(driver.findElement(By.cssSelector("input[placeholder='Type
		// to Select']")).getText());
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
			}
		}
		// check boxes size
		// check for the similar elements in the check boxes and get the size by writing
		// xpath or css
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).isEnabled());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=\"chk_friendsandfamily\"]")).isEnabled());

	}

}
