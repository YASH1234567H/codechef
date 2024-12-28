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
		    if((b==0 && c==0)||(d==0 && c==0)||(b==0 && d==0)){
		        System.out.println("Water filling time");
		    }else{
		        System.out.println("Not now");
		    }
		}
	}
}
