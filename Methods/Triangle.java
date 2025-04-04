import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        triangle(number);
    }
    public static void triangle(int number)
    {
        // Горна част
        for (int i = 1; i <= number; i++) {
            printLine(1, i);
        }
        // Долна част
        for (int i = number - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }
    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
