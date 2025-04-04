import java.util.Scanner;
import java.util.ArrayDeque;
public class BalancedParentheses {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isBalanced = true;
        for(char symbol : expression.toCharArray())
        {
            if(symbol == '(' || symbol == '[' || symbol == '{')
            {
                stack.push(symbol);
            }
            else if(symbol == ')' || symbol == ']' || symbol == '}')
            {
                if(stack.isEmpty())
                {
                    isBalanced = false;
                    break;
                }
                char lastOpen = stack.pop();
                if(!isMatching(lastOpen,symbol))
                {
                    isBalanced = false;
                    break;
                }
            }
        }
        if(!stack.isEmpty())
        {
            isBalanced = false;
        }
        System.out.println(isBalanced);
    }
    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
