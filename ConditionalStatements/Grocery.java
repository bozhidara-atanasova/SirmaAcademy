import java.util.Scanner;

public class Grocery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product: ");
        String product = scanner.nextLine().toLowerCase();

        System.out.print("Enter city: ");
        String city = scanner.nextLine().toLowerCase();

        System.out.print("Enter quantity: ");
        double quantity = scanner.nextDouble();

        double price = 0.0;

        if (city.equals("sofia")) {
            switch (product) {
                case "tea": price = 0.50; break;
                case "water": price = 0.80; break;
                case "juice": price = 1.20; break;
                case "sweets": price = 1.45; break;
                case "chips": price = 1.60; break;
                default: System.out.println("Invalid product"); return;
            }
        } else if (city.equals("plovdiv")) {
            switch (product) {
                case "tea": price = 0.40; break;
                case "water": price = 0.70; break;
                case "juice": price = 1.15; break;
                case "sweets": price = 1.30; break;
                case "chips": price = 1.50; break;
                default: System.out.println("Invalid product"); return;
            }
        } else if (city.equals("varna")) {
            switch (product) {
                case "tea": price = 0.45; break;
                case "water": price = 0.70; break;
                case "juice": price = 1.10; break;
                case "sweets": price = 1.35; break;
                case "chips": price = 1.55; break;
                default: System.out.println("Invalid product"); return;
            }
        } else {
            System.out.println("Invalid city");
            return;
        }

        System.out.printf("%.2f\n", price * quantity);
    }
}
