import java.util.Scanner;
public class Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter speed: ");
        double speed = scanner.nextDouble();
        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 60) {
            System.out.println("average");
        } else if (speed <= 120) {
            System.out.println("fast");
        } else if (speed <= 160) {
            System.out.println("super-fast");
        } else {
            System.out.println("turbo-fast");
        }
    }
}
