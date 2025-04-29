import java.util.Arrays;
import java.util.Scanner;
public class LargestTreeNumbers {
    public static void main(String[ ] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> b - a)
                .limit(3)
                .forEach(System.out::println);
    }
}
