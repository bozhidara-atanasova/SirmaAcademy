import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        //there is recursive way of doing this, but we have not mentioned it on the academy
        System.out.println("The factorial of  " + n + " is: " + factorial);
    }
}
