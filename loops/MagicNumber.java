import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in the interval: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of the interval: ");
        int end = scanner.nextInt();
        System.out.print("Enter magic number: ");
        int magicNumber = scanner.nextInt();

        int combination = 0;
        boolean found = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combination++;
                if (i + j == magicNumber) {
                    System.out.println("Combination " + combination + " - (" + i + " + " + j + " = " + magicNumber + ")");
                    found = true;
                    return;
                }
            }
        }
        System.out.println(combination + " Combinations neither - n is not = to " + magicNumber);
    }
}
