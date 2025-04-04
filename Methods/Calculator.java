import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine().toLowerCase();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "multiply":
                multiply(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
            default:
                System.out.println("Invalid command");
        }
    }

    public static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    public static void subtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    public static void multiply(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public static void divide(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println(number1 / number2);
        }
    }
}
