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
		    int c=sc.nextInt();
		    int b=sc.nextInt();
		    int z=sc.nextInt();
		    int[] d={c,b,z};
		    Arrays.sort(d);
		    System.out.println(d[2]-d[0]);
		}
	}
}
