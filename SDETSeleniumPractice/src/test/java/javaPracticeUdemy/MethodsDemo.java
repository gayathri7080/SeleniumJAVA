package javaPracticeUdemy;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo d = new MethodsDemo();
		
		// void method
		d.method1();
		
		// return method
		int num = d.intmethod();
		System.out.println(num);
		
		// static  method
		String d1 = methodstatic();
		System.out.println(d1);
		
		// static void method
		method2();
	}

	public void method1() {
		System.out.println("void only hello");
	}

	public int intmethod() {
		return 480470;

	}

	public static String methodstatic() {
		return "s"
				+ "tatic  only chinny";
	}

	public static void method2() {
		System.out.println("static void method");
	}
}
