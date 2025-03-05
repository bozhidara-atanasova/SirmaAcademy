import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter number2: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter operation(add,subtract,divide,multiply): ");
        String operation = scanner.nextLine().toLowerCase();
        int op = 0;
        if(operation.equals("add"))op = number1 + number2;
        else if(operation.equals("subtract"))op = number1 - number2;
        else if(operation.equals("divide"))op = number1 / number2;
        else if(operation.equals("multiply")) op = number1*number2;
        System.out.println(op);
    }
}
