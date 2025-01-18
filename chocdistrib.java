import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    if(a%2==0){
		        System.out.print(a/2);
		        
		        System.out.println(" "+a);
		    }else{
		        System.out.print((a/2)+1);
		        System.out.println(" "+a);
		    }
		}
	}
}
