package practice;

import org.testng.annotations.Test;

public class TestngPractice1 {
	@Test(priority=-1)
	void openApp()
	{
		System.out.println("opening app");
	}
	@Test(priority=8)
	void testLogin()
	{
		System.out.println("Logging in app");
	}
	@Test(priority=2)
	void Logout()
	{
		System.out.println("Loggout app");
	}
	@Test(priority=8)
	void testcloseApp()
	{
		System.out.println("Closing app");
	}

}
