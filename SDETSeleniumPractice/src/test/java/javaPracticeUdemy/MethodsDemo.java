package javaPracticeUdemy;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// void method
		MethodsDemo d = new MethodsDemo();
		d.method1();
		// return method
		int num = d.intmethod();
		System.out.println(num);
		// static return method
		String d1 = methodstatic();
		System.out.println(d1);
		// static void method
		method2();
	}

	public void method1() {
		System.out.println("hello");
	}

	public int intmethod() {
		return 480470;

	}

	public static String methodstatic() {
		return "chinny";
	}

	public static void method2() {
		System.out.println("/static void method");
	}
}
