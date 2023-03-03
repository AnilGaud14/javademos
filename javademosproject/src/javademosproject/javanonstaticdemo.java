package javademosproject;

public class javanonstaticdemo {
	
	public javanonstaticdemo() {
		System.out.println("From Constructor");
	}
	
	static{
		System.out.println("From static block");
	}
	{

	System.out.println("From non-static-block-1");
	}

	public static void main(String[] args)
	{
		System.out.println("From main method");
		javanonstaticdemo jnsd1= new javanonstaticdemo();
		javanonstaticdemo jnsd2= new javanonstaticdemo();
		
		Car mycar = new Car();
		System.out.println(mycar.numofwheels);
		System.out.println(Car.manufacturer);
		
		
	}
}
