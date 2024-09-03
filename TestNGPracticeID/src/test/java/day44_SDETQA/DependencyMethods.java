package day44_SDETQA;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods 
{
	@Test
	void openApp() 
	{
		Assert.assertTrue(true);;
	}
	
	@Test(dependsOnMethods ="openApp")
	void search()
	{
		Assert.assertTrue(true);
	}
	
	@Test (dependsOnMethods ="openApp")
	void advSearch()
	{
		Assert.assertTrue(false);
	}
	
	@Test (dependsOnMethods ="advSearch")
	void advSearch1()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	void closeApp()
	{
		Assert.assertTrue(true);
	}
}
