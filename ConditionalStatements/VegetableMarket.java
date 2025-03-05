import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vegetable: ");
        String vegetable = scanner.nextLine().toLowerCase();

        System.out.print("Enter day of the week: ");
        String day = scanner.nextLine().toLowerCase();

        System.out.print("Enter quantity: ");
        double quantity = scanner.nextDouble();

        boolean isWeekend = day.equals("saturday") || day.equals("sunday");
        boolean isWeekday = day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday");

        double price = 0;

        if (isWeekday) {
            switch (vegetable) {
                case "tomato": price = 2.50; break;
                case "onion": price = 1.20; break;
                case "lettuce": price = 0.85; break;
                case "cucumber": price = 1.45; break;
                case "pepper": price = 5.50; break;
                default: System.out.println("error"); return;
            }
        } else if (isWeekend) {
            switch (vegetable) {
                case "tomato": price = 2.80; break;
                case "onion": price = 1.30; break;
                case "lettuce": price = 0.85; break;
                case "cucumber": price = 1.75; break;
                case "pepper": price = 3.50; break;
                default: System.out.println("error"); return;
            }
        } else {
            System.out.println("error");
            return;
        }

        System.out.printf("%.2f\n", price * quantity);
    }
}