package extentreports1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentTestNGITestListener.class)
public class SampleTest {
	  WebDriver driver;

	    @Test
	    public void testGoogle() {
	  //      System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        Assert.assertEquals(driver.getTitle(), "Google");
	        driver.quit();
	    }

	    @Test
	    public void testBing() {
	//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.bing.com");
	        Assert.assertEquals(driver.getTitle(), "Bing");
	        driver.quit();
	    }
	    

	    @Test
	    public void testBingFail() {
	//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.bing.com");
	        Assert.assertEquals(driver.getTitle(), "Bing1");
	        driver.quit();
	    }
	    
	    @Test(dependsOnMethods ="testBingFail")
	    public void testGoogleSkip() {
	  //      System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        Assert.assertEquals(driver.getTitle(), "Google1");
	        driver.quit();
	    }

}
