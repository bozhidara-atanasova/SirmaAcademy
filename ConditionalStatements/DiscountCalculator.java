import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String membership = scanner.nextLine();

        int discount;

        if (age < 18) {
            discount = 10;
        } else if (age <= 64) {
            if (membership.equalsIgnoreCase("Yes")) {
                discount = 20;
            } else {
                discount = 10;
            }
        } else {
            discount = 30;
        }

        System.out.println(discount + "% discount");

        scanner.close();
    }
}
