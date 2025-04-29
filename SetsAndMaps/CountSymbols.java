import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class CountSymbols {
    public static void main(String[] args)
    {
     Scanner scanner = new Scanner(System.in);
     String input = scanner.nextLine();

     Map<Character,Integer> counts = new TreeMap<>();
     for(char symbol : input.toCharArray())
     {
         counts.put(symbol, counts.getOrDefault(symbol,0) + 1);
     }
     for (Map.Entry<Character,Integer> entry : counts.entrySet())
     {
         System.out.printf("%c: %d%n", entry.getKey(),entry.getValue());
     }
    }
}
