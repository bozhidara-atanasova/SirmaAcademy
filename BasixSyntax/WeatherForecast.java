import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        int degrees = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("Today is %s it is %d degrees",town,degrees));
        System.out.printf("Today in %s it is %d degrees",town,degrees);


    }
}