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
	        if(x%y==0){
	            System.out.println((x/y)*z);
	        }else if(x<y){
	            System.out.println(z);
	        }else{
	            System.out.println(((x/y)+1)*z);
	        }
	    }
	}
}
