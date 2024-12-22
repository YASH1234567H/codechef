import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(y>x){
                int a=y-x;
                System.out.println(x+(2*a));
            }else{
                    System.out.println(y);
            }
        }
    }
}
