package javademosproject;

public class loopsdemo {
	
	public static void main(String[] args) {
		
		// loops are used for repetitive tasks
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("___________________");
		
		System.out.println("Iterative method using for loop:");
		
		for (int i=1 ; i<=3 ; i++)
		{
			System.out.println("Hello World");
		}
		
		//print even numbers from 1 to 10 using for loop
		
		for (int i=1 ; i <=10 ; i++)
		{
			if( i%2 == 0)
				System.out.println(i);
		}
		
		// print sum of odd numbers from 1 to 10
		int res=0;
		
		for(int j=1 ; j<=10 ; j++)
		{
			if(j%2!=0)
				res +=j;
		}
		System.out.println(res);
		
		// print numbers from 10 to 1
		for(int k=10 ; k>=0 ; k--)
			System.out.println(k);
	}

}
