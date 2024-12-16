import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int b=sc.nextInt();
		int c=2*(l+b);
		if(c>=1000)
		{
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}
