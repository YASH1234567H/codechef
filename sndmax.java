import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i < x; i++)
        {
            int a = sc.nextInt();
            int t = sc.nextInt();
            int c = sc.nextInt();
            int[] nums = {a, t, c};
            Arrays.sort(nums); 
            System.out.println(nums[1]); 
        }
		   
    }
}
