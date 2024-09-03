package testannotationspractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2_BeforeAfterClass
{
	


	@BeforeClass
	void beforeClasstest()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	void afterClasstest()
	{
		System.out.println("AfterClass");
	}
	@Test(priority=0)
	void search()
	{
		System.out.println("This is searchresult");
	}
	@Test(priority=2)
	void Advancedsearch()
	{
		System.out.println("This is Advanced searchresult");
	}
	
	/*
	@BeforeMethod
	void login()
	{
		System.out.println("Hi happy to login method");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logged off method.....");
	}
	*/
	
	
	
}
