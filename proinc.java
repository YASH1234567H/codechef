import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<a;i++)
		{
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    int d=b/10;
		    int e=b+d;
		    int f=b-c;
		    System.out.println(e-f);
		}
	}
}
