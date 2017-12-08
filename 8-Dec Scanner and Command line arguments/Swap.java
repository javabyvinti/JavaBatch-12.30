class Swap{

	public static void main(String args[])
	{
	System.out.println("Enter your first value");
	System.out.println("Enter your second value");
		int first = Integer.parseInt(args[0]);
		int second = Integer.parseInt(args[1]);

		// first  = 20
		// second = 10

		//swap without third var.
		
		first = first + second;	// first = 30
		second = first - second; //second = 20
		first = first - second;// 30 -20 = 10
		
	System.out.println("First value = " +second);	
	System.out.println("Second value = " +first);
	}

}