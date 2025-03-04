import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = Integer.parseInt(scanner.nextLine());
        int hours = minutes / 60;
        int minutes2 = minutes % 60;
        System.out.println(hours + " : " + minutes2);


    }
}
