import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values
        int days = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String roomType = scanner.nextLine();
        String assessment = scanner.nextLine();

        // Prices per night
        double singleRoomPrice = 25.00;
        double apartmentPrice = 50.00;
        double presidentialPrice = 100.00;

        // Calculate nights
        int nights = days - 1;
        double totalCost = 0;

        // Determine base price
        if (roomType.equals("single room")) {
            totalCost = nights * singleRoomPrice;
        } else if (roomType.equals("apartment")) {
            totalCost = nights * apartmentPrice;
            if (nights < 10) {
                totalCost *= 0.70; // 30% discount
            } else if (nights <= 15) {
                totalCost *= 0.65; // 35% discount
            } else {
                totalCost *= 0.50; // 50% discount
            }
        } else if (roomType.equals("president apartment")) {
            totalCost = nights * presidentialPrice;
            if (nights < 10) {
                totalCost *= 0.90; // 10% discount
            } else if (nights <= 15) {
                totalCost *= 0.85; // 15% discount
            } else {
                totalCost *= 0.80; // 20% discount
            }
        }

        // Apply assessment adjustment
        if (assessment.equals("positive")) {
            totalCost *= 1.25; // Add 25%
        } else if (assessment.equals("negative")) {
            totalCost *= 0.90; // Deduct 10%
        }

        // Print the final price formatted to two decimal places
        System.out.printf("%.2f%n", totalCost);

        scanner.close();
    }
}
