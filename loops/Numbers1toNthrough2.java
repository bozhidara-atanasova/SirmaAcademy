import java.util.Scanner;

public class Numbers1toNthrough2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
