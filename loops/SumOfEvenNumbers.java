import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int sum = 0, count = 0, num = 2;
        while (count < n) {
            sum += num;
            num += 2;
            count++;
        }
        System.out.println("Sum of first " + n + " even number: " + sum);
    }
}
