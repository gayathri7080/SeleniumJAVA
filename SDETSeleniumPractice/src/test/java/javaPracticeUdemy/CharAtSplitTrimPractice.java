package javaPracticeUdemy;

public class CharAtSplitTrimPractice {

	public static void main(String[] args) {
		
		String s1 = " Chinny sai raj";
		String[] splitedString = s1.split("sai");
		System.out.println(splitedString.length);
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
	//	System.out.println(splitedString[2]);
	//	System.out.println(splitedString[3]);
	
		System.out.println(s1.length());
		System.out.println(s1.trim());
		
		for (int i = 0; i < s1.length(); i++) 
		{
			System.out.println(s1.charAt(i));
		}
		

	}

}
