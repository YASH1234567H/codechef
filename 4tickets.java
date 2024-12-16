import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		for(int i=0;i<x;i++)
		{
		    int a=sc.nextInt();
		    int d=4*a;
		    if(d<=1000)
		    {
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}  

	}
}
