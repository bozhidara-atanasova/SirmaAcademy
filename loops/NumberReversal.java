import java.util.Scanner;
public class NumberReversal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.nextLine());
    int reversed = 0;
    while(number!=0)
    {
        reversed = reversed * 10 + number%10;
        number /=10;
    }
    System.out.println(reversed);
    }
}
