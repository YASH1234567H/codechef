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
		    if(b>c){
		        int d=b-c;
		        double z=d/4.0;
		        int y=(int)z;
		        if(z==y){
		            System.out.println(y);
		        }else{
		            y++;
		            System.out.println(y);
		        }
		    }else{
		        System.out.println("0");
		    }
		}
	}
}