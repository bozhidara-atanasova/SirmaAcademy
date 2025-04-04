import java.util.Scanner;
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        grades(number);
    }
    public static void grades(double number)
    {
        if(number >= 2.00 & number < 2.99)System.out.println("Fail");
        else if(number >= 3.00 & number <= 3.49)System.out.println("Poor");
        else if(number > 3.49 & number <= 4.49)System.out.println("Good");
        else if(number > 4.49 & number <= 5.49)System.out.println("Very good");
        else if(number > 5.49 & number <= 6.00)System.out.println("Excellent");
        else System.out.println("Wrong input");
    }
}
