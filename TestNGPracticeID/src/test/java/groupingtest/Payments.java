package groupingtest;

import org.testng.annotations.Test;

public class Payments {

	@Test (groups={"regression","sanity","functional"})
	void paymentinRupees()
	{
		System.out.println("payment in rupees");
	}
	
	@Test
	void paymentinDollars()
	{
		System.out.println("payment in Dollars");
	}
	
}
