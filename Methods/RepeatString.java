import java.util.Scanner;
public class RepeatString {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String result = repeatString(text, count);
        System.out.println(result);
    }
    public static String repeatString(String text, int count) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(text);
        }

        return builder.toString();
    }
}
