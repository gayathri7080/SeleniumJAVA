package assignmentpracticeudemy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;


public class FirstSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ggoritya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ggoritya\\OneDrive - Capgemini\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
//System.setProperty("webdriver.edge.driver", "C:\\Users\\ggoritya\\OneDrive - Capgemini\\Documents\\Selenium web drivers\\edgedriver_win64\\msedgedriver.exe");
		
		
		//WebDriver driver =  new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	
		
	}

}
