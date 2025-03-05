import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int ticketPrice;

        if (age >= 0 && age <= 12) {
            ticketPrice = 5;
        } else if (age >= 13 && age <= 19) {
            ticketPrice = 8;
        } else {
            ticketPrice = 10;
        }

        System.out.println("$" + ticketPrice);

        scanner.close();
    }
}