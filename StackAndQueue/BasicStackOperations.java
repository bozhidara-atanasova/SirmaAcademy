import  java.util.*;
public class BasicStackOperations {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //we read the 3 numbers in a line
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.nextLine(); //we clear the new line

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] elements = scanner.nextLine().split("\\s+");
        for (int i = 0; i < n; i++)
        {
            stack.push(Integer.parseInt(elements[i]));
        }
        for (int i = 0;i < s && !stack.isEmpty();i++)
        {
            stack.pop();
        }
        if (stack.contains(x)) {
            System.out.println("true");
        } else if (!stack.isEmpty()) {
            // Намерете най-малкия елемент
            int min = Collections.min(stack);
            System.out.println(min);
        } else {
            System.out.println(0);
        }
    }
}
