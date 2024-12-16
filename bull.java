import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // Read number of test cases
		for(int i = 0; i < T; i++) // Loop through each test case
		{
		    int X = sc.nextInt(); // Buying price
		    int Y = sc.nextInt(); // Selling price
		    
		    if (X < Y) {
		        System.out.println("PROFIT");
		    } else if (X > Y) {
		        System.out.println("LOSS");
		    } else {
		        System.out.println("NEUTRAL");
		    }
		}  

	}
}
