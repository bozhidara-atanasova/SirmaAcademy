import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println(number);
        System.out.println(number2);
        int sum = number + number2;
        int dif = number - number2;
        int dif2 = number2 - number;
        int multiplication = number2 * number;
        System.out.println(sum);
        System.out.println(dif);
        System.out.println(dif2);
        System.out.println(multiplication);

    }
}
