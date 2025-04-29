import java.util.*;

public class AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");

            String name = parts[0];
            double grade = Double.parseDouble(parts[1]);

            studentGrades.putIfAbsent(name, new ArrayList<>());

            studentGrades.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String name = entry.getKey();
            List<Double> grades = entry.getValue();

            System.out.print(name + " -> ");

            for (double g : grades) {
                System.out.printf("%.2f ", g);
            }

            double sum = 0;
            for (double g : grades) {
                sum += g;
            }
            double avg = sum / grades.size();
            System.out.printf("(avg: %.2f)%n", avg);
        }
    }
}
