import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(word.equals(reversed) ? "true" : "false");
    }
}
