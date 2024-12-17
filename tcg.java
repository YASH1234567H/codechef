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
        if(a<b)
        {
            System.out.println("increased");
        }else if (a==b) 
        {
            System.out.println("same");
        }else{
            System.out.println("decreased");
        }
	}
}
