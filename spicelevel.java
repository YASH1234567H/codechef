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
		    if(b<4){
		        System.out.println("mild");
		    }else if(4<=b && b<7){
		        System.out.println("medium");
		    }else{
		        System.out.println("hot");
		    }
		}
	}
}