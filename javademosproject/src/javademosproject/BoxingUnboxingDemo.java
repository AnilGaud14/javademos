package javademosproject;

public class BoxingUnboxingDemo {
	
	// Wrapper types
	
	public static void main(String[] args) {

	// Boxing - conversion of primitive to object or wrapper class
		
		int a = 5;
		
		Integer b = new Integer(a);
		
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		
	// Unboxing - conversion of wrapper class to primitive
		
		Integer c = new Integer(10);
		
		int d = c;
		
		System.out.println("c ="+ c);
		System.out.println("d ="+ d);
	}

}
