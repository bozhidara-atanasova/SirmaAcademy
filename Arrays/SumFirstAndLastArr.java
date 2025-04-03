import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumFirstAndLastArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String values = scanner.nextLine();
        String[] items = values.split(",");
        int[] arr = new int[items.length];
        int sum = 0;

        for(int i = 0;i < items.length;i++)
        {
            arr[i] = Integer.parseInt(items[i]);
            sum += arr[i];
        }
        System.out.println(sum);

    }
}