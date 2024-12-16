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
        int d=a-b;
        if(d>0){
            if(d<=c){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }else{
            d=-d;
            if(d<=c){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
           
        }
}    
}