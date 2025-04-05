import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();
        int[][] matrix1 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = Integer.parseInt(row[j]);
            }
        }
        int[][] matrix2 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = Integer.parseInt(row[j]);
            }
        }
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0;i < rows;i++)
        {
            for (int j = 0;j < cols;j++)
            {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
