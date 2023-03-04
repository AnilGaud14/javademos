package inheritance;

public class VehicleDemo {

		public static void main(String[] args) {
			
			Car car = new Car();
			System.out.println(car.fuel());
			
			Bus bus = new Bus();
			System.out.println(bus.fuel());
			
			Bike bike = new Bike();
			System.out.println(bike.fuel());
	
		}
}

class Vehicle{
	
	String fuel()
	{
		return "Petrol";
	}
	
}

class Bus extends Vehicle{
	String fuel()
	{
		return "CNG";
	}
}

class Car extends Vehicle{
	String fuel()
	{
		// returning from parent class use keyword super
//		return "Diesel";
		return super.fuel();
	}
}

class Bike extends Vehicle{
	
}