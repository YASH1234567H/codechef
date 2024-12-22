import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    if(3*b<2*c){
		        System.out.println(3*b);
		    }else{
		        System.out.println(2*c);
		    }
		}
	}
}