import java.util.Scanner;
public class MatrixDiagonalSum {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
                if (i == j) {
                    sum += matrix[i][j]; // Главен диагонал
                }

                if(i + j == rows- 1)
                {
                    sum+= matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
