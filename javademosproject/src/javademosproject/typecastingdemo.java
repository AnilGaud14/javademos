package javademosproject;

public class typecastingdemo {
	
	public static void main(String[] args) {
		
		byte b = 100;
		
		int a = 65;
		
		// implicit type-casting conversion happens automatically
		
		b = (byte) a;
		System.out.println(b);
		
		// explicit type-casting conversion happens by hands.
		
		char ch = 'a';
		System.out.println(ch);
		
		int x = ch;
		System.out.println(x);
		
		int y = 119;
		char z = (char) y;
		System.out.println(z);
		
		
	}

}
