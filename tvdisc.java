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
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int e=sc.nextInt();
		    if(b-d<c-e){
		        System.out.println("first");
		    }else if(b-d==c-e){
		        System.out.println("any");
		    }else{
		        System.out.println("second");
		    }
		}
	}
}
