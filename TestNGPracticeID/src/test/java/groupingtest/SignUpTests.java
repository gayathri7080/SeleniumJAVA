package groupingtest;

import org.testng.annotations.Test;

public class SignUpTests 
{
	@Test (groups="regression")
	void SignUpByEmail()
	{
		System.out.println("Sign up by email");
	}
	
	@Test (groups="regression")
	void SignUpByFaceBook()
	{
		System.out.println("Sign up by FaceBook");
	}
	
	@Test
	void SignUpByTwitter()
	{
		System.out.println("Sign up by Twitter");
	}
	
}
