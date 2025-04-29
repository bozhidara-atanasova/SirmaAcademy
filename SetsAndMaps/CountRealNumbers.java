import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
public class CountRealNumbers {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //we read the whole line as text
        String inputLine = scanner.nextLine();
        //we separate by interval
        String[] tokens = inputLine.split("\\s+");
        Map<Double,Integer> count = new LinkedHashMap<>();

        for(String token : tokens)
        {
            double number = Double.parseDouble(token);
            if(!count.containsKey(number))
            {
                count.put(number,1);
            }
            else
            {
                count.put(number,count.get(number) + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : count.entrySet()) {
            double key = entry.getKey();
            int value = entry.getValue();
            System.out.printf("%.1f -> %d%n", key, value);
        }
    }
}
