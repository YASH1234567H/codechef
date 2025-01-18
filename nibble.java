import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int a=sc.nextInt();
		    double b=a/4.0;
		    if(a/4==b){
		        System.out.println("good");
		    }else{
		        System.out.println("not good");
		    }
		}
	}
}
