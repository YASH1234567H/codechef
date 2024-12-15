import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public static void main (String[] args) throws java.lang.Exception
{
// x-n*10=a
//int y=a/20
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
        int n=sc.nextInt();
        int a=x-(n*10);
        int y=a/20;
        System.out.println(y);
}
}