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
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a*b*c>d*d*d){
            System.out.println("cuboid");
        }else if (a*b*c==d*d*d){
            System.out.println("equal");
        }else{
            System.out.println("cube");
        } 
	}
}
