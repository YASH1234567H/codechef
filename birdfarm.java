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
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        int z=sc.nextInt();
	        boolean a=(z%x==0);
	        boolean b=(z%y==0);
	        if(a&&b){
	            System.out.println("any");
	        }else if(a){
	            System.out.println("chicken");
	        }else if(b){
	            System.out.println("duck");
	        }else{
	            System.out.println("none");
	        }
	    }
	}
}
