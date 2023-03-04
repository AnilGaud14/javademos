package inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		System.out.println(animal.speed);
	}
}

class Animal{
	
	int speed=100 ;
}
