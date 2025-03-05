import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter budget: ");
        double budget = scanner.nextDouble();

        System.out.print("Enter season (summer/winter): ");
        String season = scanner.next().toLowerCase();

        String destination;
        String accommodation;
        double spentAmount;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                accommodation = "Camp";
                spentAmount = budget * 0.30;
            } else if (season.equals("winter")) {
                accommodation = "Hotel";
                spentAmount = budget * 0.70;
            } else {
                System.out.println("Invalid season");
                return;
            }
        } else if (budget <= 1000) {
            destination = "Europe";
            if (season.equals("summer")) {
                accommodation = "Camp";
                spentAmount = budget * 0.40;
            } else if (season.equals("winter")) {
                accommodation = "Hotel";
                spentAmount = budget * 0.80;
            } else {
                System.out.println("Invalid season");
                return;
            }
        } else {
            destination = "Asia";
            accommodation = "Hotel";
            spentAmount = budget * 0.90;
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f\n", accommodation, spentAmount);
    }
}