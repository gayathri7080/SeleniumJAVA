package extenetReports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtenetReportManager.class)
public class OrangeHRM {

    WebDriver driver;
    
    @BeforeClass
    void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Ensure correct path to chromedriver
        driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    void accountTest() {
        String phnNum = driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[2]")).getText();
        Assert.assertEquals(phnNum, "123456789");
        System.out.println(phnNum + " testing");
    }

    @Test
    void logoTest() {
        boolean logoStatus = driver.findElement(By.xpath("//a[normalize-space()='Qafox.com']")).isDisplayed();
        Assert.assertTrue(logoStatus);
    }
}