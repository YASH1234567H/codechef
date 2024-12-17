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
            if(2*b==5*c){
                System.out.println("either");
            }else if(2*b>5*c){
                System.out.println("chocolate");
            }else{
                System.out.println("candy");
            }
        }
	}
}
