package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager; //log4j
import org.apache.logging.log4j.Logger; //log4j
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;		//log4j2
	public Properties p;		//config properties file
	
	
	@BeforeClass
	@Parameters({"os", "browser"})
	public void setUp( String os, String br) throws IOException 
	{
		//loading config.properties File
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		
		logger = LogManager.getLogger(this.getClass()); 	//log4j2
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver();
		break;
		
		case "edge" : driver = new EdgeDriver();
		break;
		
		case "firefox" : driver = new FirefoxDriver();
		break;
		
		default : System.out.println("Invalid browser name....");
		return;
		
		}
	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(600));
	//	driver.get("https://demo.opencart.com/en-gb?route=common/home");
		driver.get(p.getProperty("appURL"));	//reading URL from property file
		driver.manage().window().maximize();
		
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	public String randomAlphaNumeric() {
		String generatedNum = RandomStringUtils.randomNumeric(10);
		String generatedString = RandomStringUtils.randomAlphabetic(10);
		return (generatedString + "@" + generatedNum );
	}
	

	public String randomeString() {
		String genaratedString = RandomStringUtils.randomAlphabetic(5);
		return genaratedString;
	}
	
	public String randomNumber() {
		String generatedNum = RandomStringUtils.randomNumeric(10);
		return generatedNum;
	}

}
