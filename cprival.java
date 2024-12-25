import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    int d=sc.nextInt();
	    int e=a+c;
	    int f=b+d;
	    if(e>f){
	        System.out.println("Dominater");
	    }else{
	        System.out.println("Everule");
	    }
	}
}
