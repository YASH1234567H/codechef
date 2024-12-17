import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	    if(a%2==0)
	    {
	        System.out.println(a/2);
	    }else{
	        int b=(a/2)+1;
	        System.out.println(b);
	    }
	}
}
