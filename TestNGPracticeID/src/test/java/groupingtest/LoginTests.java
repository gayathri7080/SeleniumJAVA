package groupingtest;

import org.testng.annotations.Test;

public class LoginTests {

	@Test (groups="sanity")
	 void loginByEmail()
	{
		System.out.println("login by email");
	}
	
	@Test (groups="sanity")
	 void loginByFaceBook()
	{
		System.out.println("login by FaceBook");
	}
	
	
	
	
	
	
	
}
