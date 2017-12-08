
import java.util.Scanner;

class Sum{


	public static void main(String args[])
	{
	
	// Scanner is a predefined class --> input
	
	Scanner sc = new Scanner(System.in); 	
	// Integer --> nextInt();
	// flaot --> nextFloat();
	// long --> nextLong();
	System.out.println("Enter your first value");
	
	int first = sc.nextInt();


	System.out.println("Enter your second value");
	
	int second = sc.nextInt();
	
	int result = first + second;	
	System.out.println("Sum is = " + result);	

	}
}