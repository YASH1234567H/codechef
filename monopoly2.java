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
		    int e=sc.nextInt();
		    if(b+c+d<e ||b+c+e<d ||b+e+d<c ||e+c+d<b){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}
