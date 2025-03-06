import java.util.Scanner;

public class NewBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of floors: ");
        int floors = scanner.nextInt();
        System.out.print("Enter number of rooms: ");
        int rooms = scanner.nextInt();

        for (int floor = floors; floor >= 1; floor--) {
            for (int room = 0; room < rooms; room++) {
                if (floor == floors) {
                    System.out.print("L" + floor + room + " ");
                } else if (floor % 2 == 0) {
                    System.out.print("O" + floor + room + " ");
                } else {
                    System.out.print("A" + floor + room + " ");
                }
            }
            System.out.println();
        }
    }
}
