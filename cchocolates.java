import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int c=(5*x)+(10*y);
            if(c<z){
                System.out.println(0);
            }else{
                int d=c/z;
                System.out.println(d);
            }
        }
    }
}
