import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        double result = 0.0;
        for (int i = 1; i <=a; i++) {
            result = result + (double) 1 / i;
        }
        System.out.println("Harmonic number of " + a + " is " + result);
    }
}