package testannotationspractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3_BeforeAfterTest {
	
	
	@AfterTest
	void aftertestPractice()
	{
		System.out.println("aftertest$");
	}
	
	@BeforeTest
	void beforetestPractice()
	{
		System.out.println("beforetest$");
	}
	
	@Test
	void beforeAftertestPractice()
	{
		System.out.println("beforeAftertestPractice");
	}

}
