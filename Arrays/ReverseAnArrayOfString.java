import java.util.Scanner;
public class ReverseAnArrayOfString {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] arr = input.split(",");
        int n = arr.length;
        for(int i = 0;i<n/2;i++)
        {
            String temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println(String.join(" ",arr));
    }
}
