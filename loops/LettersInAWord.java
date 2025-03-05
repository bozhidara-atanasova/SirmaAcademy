import java.util.Scanner;

public class LettersInAWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scanner.next();

        for (char letter : word.toCharArray()) {
            System.out.println(letter);
        }
    }
}
