package javademosproject;

public class datatypesdemo {
	
	static byte a= 50;
	
	public static void main(String[] args) {
		System.out.println(a);
		
		a= (byte) 129;
		
		System.out.println(a);
		
		short b = 129;
		System.out.println(b);
		
		System.out.println("Byte Max Value: " + Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		float f = 1.23f;
		System.out.println(f);
		
		double d = 12345.6789;
		System.out.println(d);
		
	}

}
