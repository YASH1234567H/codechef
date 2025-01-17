import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    int b=0;
		    while(a!=0)
		    {
		        int c=a%10;
		        b=b*10+c;
		        a=a/10;
		    }
		    System.out.println(b);
		}
	}
}
