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
		    int d=b*c;
		    if(d%4==0){
		        System.out.println(d/4);
		    }else{
		        int e=d/4;
		        e++;
		        System.out.println(e);
		    }
		}
	}
}
