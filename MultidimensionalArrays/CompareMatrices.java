import java.util.Scanner;
public class CompareMatrices {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] matrix1 = new int[rows][cols];

        for (int row = 0;row < rows;row++)
        {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0;column < cols;column ++)
            {
                matrix1[row][column] = Integer.parseInt(inputTokens[column]);
            }
        }
        int rows2 = Integer.parseInt(scanner.nextLine());
        int cols2 = Integer.parseInt(scanner.nextLine());
        int[][] matrix2 = new int[rows2][cols2];
        for (int row = 0;row < rows2;row++)
        {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0;column < cols2;column ++)
            {
                matrix2[row][column] = Integer.parseInt(inputTokens[column]);
            }
        }
        if (rows != rows2 || cols != cols2) {
            System.out.println("not equal");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }

        System.out.println("equal");
    }
}
