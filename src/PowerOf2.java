import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter powers of Two : ");
        int x = sc.nextInt();
        int n = 2;
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = n * result;
        }
        System.out.println("Power = " + result);
    }
}