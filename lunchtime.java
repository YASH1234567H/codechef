import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		for(int i=0;i<b;i++)
		{
		    int a=sc.nextInt();
		    if(a>=1 && a<=4)
	     	{
		        System.out.println("yes");
	    	}else{
		        System.out.println("no");
	    	}
	    }
	}
}