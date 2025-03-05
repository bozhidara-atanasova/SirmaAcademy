import java.util.Scanner;

public class AlarmAfter15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();

        minutes += 15;
        if (minutes >= 60) {
            minutes -= 60;
            hours += 1;
        }

        if (hours >= 24) {
            hours = 0;
        }

        System.out.printf("%d:%02d\n", hours, minutes);
    }
}
