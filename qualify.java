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
		    int x=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=a+(b*2);
		    if (x<=c){
		        System.out.println("qualify");
		    }else{
		        System.out.println("notqualify");
		    }
		}
	}
}
