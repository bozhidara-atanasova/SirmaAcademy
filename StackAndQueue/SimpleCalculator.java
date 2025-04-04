import java.util.Scanner;
import java.util.ArrayDeque;
public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int current = Integer.parseInt(tokens[0]);
        stack.push(current);

        for (int i = 1;i < tokens.length;i += 2)
        {
            String operator = tokens[i];
            int number = Integer.parseInt(tokens[i + 1]);

            if(operator.equals("+"))
            {
                stack.push(number);
            } else if (operator.equals("-")) {
                stack.push(-number);
            }
        }
        int result = 0;
        while (!stack.isEmpty())
        {
            result += stack.pop();
        }

        System.out.println(result);
    }
}
