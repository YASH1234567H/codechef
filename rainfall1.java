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
		    if(b<3)
		    {
		        System.out.println("light");
		    }else if (b>=3 && b<7)
		    {
		        System.out.println("moderate");
		    }else{
		        System.out.println("heavy");
		    }
		}
	}
}
