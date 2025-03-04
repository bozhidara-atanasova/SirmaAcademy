import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        double miles = 0.621371192;
        double kmToMiles = kilometers * miles;
        System.out.println(kmToMiles);
    }
}