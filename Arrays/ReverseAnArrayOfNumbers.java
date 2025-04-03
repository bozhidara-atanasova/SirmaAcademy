import java.util.Scanner;
public class ReverseAnArrayOfNumbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String values = scanner.nextLine();
        String[] items = values.split(",");
        int[] arr = new int[items.length];
        for(int i = 0;i < items.length;i++)
        {
            arr[i] = Integer.parseInt(items[i]);
        }
        for(int i = n - 1; i >= 0;i --)
        {
            System.out.println(arr[i]);
        }
    }
}
