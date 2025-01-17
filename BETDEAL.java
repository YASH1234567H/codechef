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
		    int b=sc.nextInt();
		    int c=100-(100/100)*a;
		    int d=200-(200/100)*b;
		    if(c<d){
		        System.out.println("first");
		    }else if(c==d){
		        System.out.println("both");
		    }else
		    {
		        System.out.println("second");
		    }
		}
	}
}
