import java.util.Scanner;

public class Climate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double latitude = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        String hemisphere = scanner.nextLine();

        if (latitude == 0) {
            System.out.println("Equator");
        } else if (Math.abs(latitude) > 66.5) {
            System.out.println("Arctic Zone");
        } else if (Math.abs(latitude) >= 23.5) {
            System.out.println("Temperate Zone");
        } else {
            System.out.println("Tropic Zone");
        }

        scanner.close();
    }
}
