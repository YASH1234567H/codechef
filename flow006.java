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
		    int number = sc.nextInt();
            int sum = 0;
            number = Math.abs(number);
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            System.out.println(sum);
		}
	}
}
