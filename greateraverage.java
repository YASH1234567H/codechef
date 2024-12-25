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
            int c=sc.nextInt();
            int d=sc.nextInt();
            double e=(b+c)/2.0;
            if(e>d){
                System. out. println("yes");
            }else{
                System. out. println("no");
            }
        }
	}
}