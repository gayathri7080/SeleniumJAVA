package javaPracticeUdemy;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PartialScrenshot_heigtwidhUIelements {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.cssSelector("[name='name']:nth-child(2)"));
		//to open the new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		//to open the new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		Set<String> Hindows = driver.getWindowHandles();
		Iterator<String> it = Hindows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.get("https://rahulshettyacademy.com/");
		String CourseName = driver.findElements(By.cssSelector("a[href*=\"https://courses.rahulshettyacademy.com/p/\"]")).get(1).getText();
		driver.switchTo().window(parentId);
		name.sendKeys(CourseName);
		
		//Screenshot
		File filepng = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(filepng, new File("logo1.png"));
		FileUtils.copyFile(filepng, new File("C:\\Users\\ggoritya\\OneDrive - Capgemini\\Desktop\\screenshot2.png"));
		
		
		//GEt Height & Width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		

	}

}
