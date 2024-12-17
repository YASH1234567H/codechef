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
		    int s=sc.nextInt();
		    int b=sc.nextInt();
		    int c=s+b;
		    if(c%2==0)
		    {
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}
