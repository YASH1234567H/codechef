import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y=n*x;
            if(9999<y && y<=99999){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
