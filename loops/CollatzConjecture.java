import java.util.Scanner;
public class CollatzConjecture {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while(n!=1)
        {
            System.out.print(n + " ");
            if(n%2 == 0) n/= 2;
            else n = n * 3 +1;
        }
        System.out.println(n);

    }
}
