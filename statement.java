import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0; 
		int b = 0; 
		
		for(int i = 0; i < N; i++){
		    int c = sc.nextInt(); 
		    if(c % 2 == 0){
		        a++;
		    } else {
		        b++;
		    }
		}
		if(a > b){
		    System.out.println("READY FOR BATTLE");
		} else {
		    System.out.println("NOT READY");
		}
	}
}