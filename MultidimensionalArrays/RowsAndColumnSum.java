import java.util.Scanner;

public class RowsAndColumnSum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[rows][cols];
        int[] colSums = new int[cols];

        // Четене на матрицата
        for (int i = 0; i < rows; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
                colSums[j] += matrix[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
                rowSum += matrix[i][j];
            }
            System.out.println("= " + rowSum);
        }

        for (int i = 0; i < cols; i++) {
            System.out.print("― ");
        }
        System.out.println();


        for (int j = 0; j < cols; j++) {
            System.out.print(colSums[j] + " ");
        }
    }
}
