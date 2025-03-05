import java.util.Scanner;

public class NumbersNoTo0Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
