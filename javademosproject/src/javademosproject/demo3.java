package javademosproject;

public class demo3 {
	public static void main(String[] args) {
		System.out.println("From main method");
		method1();
		method2();
		//method3();
		
		demo3 dem3= new demo3();
		dem3.method3();
	}
	static void method1() {
		System.out.println("From static method 1");
	}
	static void method2() {
		System.out.println("From static method 2");
	}

	void method3() {
		System.out.println("From static method 3");
	}
}
