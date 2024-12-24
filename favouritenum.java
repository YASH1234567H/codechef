import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            if(a%2==0 && a%7==0){
                System.out.println("alice");
            }else if (a%2!=0 && a%9==0){
                System.out.println("bob");
            }else{
                System.out.println("charlie");
            }
        }
    }
}
