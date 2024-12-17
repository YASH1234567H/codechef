import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    if(c<b && b>d)
		    {
		        System.out.println("alice");
		    }
		    else if (c>b && c>d)
		    {
		        System.out.println("bob");
		    }else{
		        System.out.println("charlie");
		    }
		}
	}
}
