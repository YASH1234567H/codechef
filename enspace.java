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
            int n=sc.nextInt();
            int b=sc.nextInt();
            int m=n+(2*b);
            if(c>=m)
            {
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
	}
}
