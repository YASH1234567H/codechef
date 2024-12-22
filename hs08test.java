import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    double b=sc.nextDouble();
	    if(a%5==0 && a+0.50<=b)
	    {
	        b-=(a+0.50);
	    }
	    System.out.printf("%.2f\n",b);
	}
}
