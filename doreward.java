import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=0;i<a;i++)
		{
		    int b=sc.nextInt();
		    if(b<=3){
		        System.out.println("bronze");
		    }else if(3<b && b<=6){
		        System.out.println("silver");
		    }else{
		        System.out.println("gold");
		    }
		}
	}
}
