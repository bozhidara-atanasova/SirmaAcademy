import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < count; i++) {
            String username = scanner.nextLine();
            usernames.add(username);
        }

        for (String name : usernames) {
            System.out.println(name);
        }
    }
}
