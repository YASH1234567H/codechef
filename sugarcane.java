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
		    int c=50*b;
		    double d=(c/100.0)*20.0;
		    double e=(c/100.0)*30.0;
		    int z=(int)d;
		    int y=(int)e;
		    int f=c-(z+z+y);
		    System.out.println(f);
		}
	}
}
