package testannotationspractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestCase4_BeforeAfterSuite {
	
	
	@AfterSuite
	void afterSuitePractice()
	{
		System.out.println("after$uite");
	}
	
	@BeforeSuite
	void beforeSuitePractice()
	{
		System.out.println("before$uite");
	}

}
