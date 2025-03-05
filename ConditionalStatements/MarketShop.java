import java.util.Scanner;

public class MarketShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double renovationCost = scanner.nextDouble();
        int powderCount = scanner.nextInt();
        int lipstickCount = scanner.nextInt();
        int spiralCount = scanner.nextInt();
        int shadowsCount = scanner.nextInt();
        int concealerCount = scanner.nextInt();

        double powderPrice = 2.60;
        double lipstickPrice = 3.00;
        double spiralPrice = 4.10;
        double shadowsPrice = 8.20;
        double concealerPrice = 2.00;

        double totalCost = (powderCount * powderPrice +
                lipstickCount * lipstickPrice +
                spiralCount * spiralPrice +
                shadowsCount * shadowsPrice +
                concealerCount * concealerPrice);

        int totalItems = powderCount + lipstickCount + spiralCount + shadowsCount + concealerCount;

        if (totalItems >= 50) {
            totalCost *= 0.75; // Apply 25% discount
        }

        double profit = totalCost * 0.90;

        if (profit >= renovationCost) {
            double remainingMoney = profit - renovationCost;
            System.out.printf("Yes! %.2f lv left.%n", remainingMoney);
        } else {
            double neededMoney = renovationCost - profit;
            System.out.printf("Not enough money! %.2f lv needed.%n", neededMoney);
        }

        scanner.close();
    }
}
