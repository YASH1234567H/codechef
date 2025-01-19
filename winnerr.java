import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int i=0;i<t ;i++ ){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int e=Math.max(a,b);
		    int f=Math.max(c,d);
		    if(e<f){
		        System.out.println("P");
		    }else if(f<e){
		        System.out.println("Q");
		    }else{
		        System.out.println("TIE");
		    }
		} 
	}
}
