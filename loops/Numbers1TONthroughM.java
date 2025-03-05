import java.util.Scanner;

public class Numbers1TONthroughM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();
        System.out.print("Enter interval M: ");
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i += m) {
            System.out.println(i);
        }
    }
}
