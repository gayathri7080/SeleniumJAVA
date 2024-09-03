package testannotationspractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1_BeforeAfterMethod
{

	@BeforeMethod
	void login()
	{
		System.out.println("Hi happy to login BeforeMethod");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logged off.....AfterMethod");
	}
	@Test(priority=0)
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority=2)
	void Advancedsearch()
	{
		System.out.println("This is Advanced search");
	}
}
