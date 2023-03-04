package inheritance;

public class JDKDemo {
	public static void main(String[] args) {
		
//		JDK6 jdk6 = new JDK6();
//		JDK7 jdk7 = new JDK7();
		
		JDK8 jdk8 = new JDK8();
		
	}
}
	
class JDK6 {
	JDK6()
	{
		System.out.println("Installing KDK6");
	}
}
class JDK7 extends JDK6{
	JDK7(){
		System.out.println("Installing KDK7");
	}
}

class JDK8 extends JDK7{
	JDK8(){
		System.out.println("Installing KDK8");
	}
}

