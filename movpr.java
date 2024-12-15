import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
        int a=x+y;
        if(z>a)
        {
            int e=2*x+(3*y);
            System.out.println(e);
        }else
        {
            int f=2*z+y;
            System.out.println(f);
        }
}
}