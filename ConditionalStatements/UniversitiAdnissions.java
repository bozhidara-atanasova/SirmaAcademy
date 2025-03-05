import java.util.Scanner;

public class UniversitiAdnissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        int extracurriculars = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Admitted");
        } else if (score >= 80 && extracurriculars >= 2) {
            System.out.println("Admitted");
        } else {
            System.out.println("Not admitted");
        }

        scanner.close();
    }
}
