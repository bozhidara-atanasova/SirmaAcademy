import java.util.Scanner;

public class SumOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String word = sc.next().toLowerCase();

        int sum = 0;
        for(char letter : word.toCharArray())
        {
            switch (letter)
            {
                case 'a' : sum += 1;break;
                case 'e' : sum += 2;break;
                case 'i' : sum += 3;break;
                case 'o' : sum += 4;break;
                case 'u' : sum += 5;break;
            }
        }
        System.out.println("Sum of vowels is: " + sum);
    }
}
