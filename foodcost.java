import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(1<=a&&a<b&&b<=1000)
        {
            int c=6*a+b;
            System.out.println(c);
        }
        else
        {
            System.out.println("input valuse are out of constraits");
        }
       
    }
}
