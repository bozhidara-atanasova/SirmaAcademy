import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean isValid = true;

        if (!isLengthValid(password)) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!isLettersAndDigits(password)) {
            System.out.println("Password must contain only letters and digits");
            isValid = false;
        }

        if (!hasAtLeastTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isLengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isLettersAndDigits(String password) {
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAtLeastTwoDigits(String password) {
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}
