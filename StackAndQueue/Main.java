import java.util.ArrayDeque;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(String str : input)
        {
            stack.push(Integer.parseInt(str));
        }
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop() + " ");
        }
    }
}