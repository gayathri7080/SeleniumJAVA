package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SoftAssert sa = new SoftAssert();
		@Test
		void  example()
		{
		sa.assertEquals(1, 2); //Soft assertion
		System.out.println("Passes12");
	
		
		Assert.assertEquals(1,0); //Hard assertion
		System.out.println("Passes123");
		sa.assertAll();
		
}

}
