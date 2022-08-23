import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any Number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}