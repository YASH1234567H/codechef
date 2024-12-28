import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++){
		    int b=sc.nextInt();
		    if(b<=100){
		        System.out.println(b);
		    }else if(100<b && b<=1000){
		        System.out.println(b-25);
		    }else if(1000<b && b<=5000){
		        System.out.println(b-100);
		    }else{
		        System.out.println(b-500);
		    }
		}
	}
}
