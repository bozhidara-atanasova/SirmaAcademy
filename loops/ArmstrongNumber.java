import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();

        int original = n, sum = 0, digits = String.valueOf(n).length();
        while (n > 0) {
            sum += Math.pow(n % 10, digits);
            n /= 10;
        }
        System.out.println(original == sum ? "true" : "false");
    }
}
