package coreJava;

public class AustralianTraffic implements Interface_CentralTraffic{

	private static int a2;
	private static int a3;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interface_CentralTraffic at = new AustralianTraffic();
		at.grrnGo();
		at.redStop();
		at.yellowFlash();
		
	//	AustralianTraffic at1 = new AustralianTraffic();
	//	at1.gmethod1();
	
		
	}

	
	public void gmethod1() {
		// TODO Auto-generated method stub
		System.out.println("gmethod1");
	}
	@Override
	public void grrnGo() {
		// TODO Auto-generated method stub
		System.out.println("greengo imp");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop imp");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("yellowflash imp");
	}

}
