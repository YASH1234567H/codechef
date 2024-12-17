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
		    if(b<=70){
		        System.out.println("0");
		    }else if(b>70 && b<=100){
		        System.out.println("500");
		    }else{
		        System.out.println("2000");
		    }
		}
	}
}
