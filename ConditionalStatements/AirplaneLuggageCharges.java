import java.util.Scanner;

public class AirplaneLuggageCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();
        int dimensionsSum = scanner.nextInt();

        int fee = 0;
        boolean overweight = false;
        boolean oversize = false;

        if (weight > 50) {
            fee += 100;
            overweight = true;
        }

        if (dimensionsSum > 158) {
            oversize = true;
            int excess = dimensionsSum - 158;
            if (excess >= 1 && excess <= 20) {
                fee += 50;
            } else if (excess <= 50) {
                fee += 100;
            } else if (excess > 50) {
                fee += 200;
            }
        }

        if (overweight && oversize) {
            fee += 50;
        }

        System.out.println("$" + fee + " (" + (overweight ? "Overweight" : "") + (overweight && oversize ? " + " : "") + (oversize ? "Oversize" : "") + (overweight && oversize ? " + Handling" : "") + ")");

        scanner.close();
    }
}
