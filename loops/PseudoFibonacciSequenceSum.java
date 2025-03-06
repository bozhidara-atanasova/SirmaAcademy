import java.util.Scanner;

public class PseudoFibonacciSequenceSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
            sum += a;
        }
        System.out.println("Sum of first " + n + " Fibonacci numbers: " + sum);
    }
}
