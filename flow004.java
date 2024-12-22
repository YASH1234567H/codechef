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
		    int b= sc.nextInt();
            int c=b%10;
            while (b>=10){
                b/=10;   
            }
            int d=b;
            System.out.println(c+d);
		}
	}
}
