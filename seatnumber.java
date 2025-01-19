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
		    if(0<a&& a<11){
		        System.out.println("Lower Double");
		    }else if(10<a&&a<16){
		        System.out.println("Lower Single");
		    }else if(15<a && a<26){
		        System.out.println("Upper Double");
		    }else{
		        System.out.println("Upper Single");
		    }
		}
	}
}
