import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[][] intMatrix = new int[2][2];
        /* int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        System.out.println(matrix[1][1]);*/
        int[][] array = new int[3][4];
        for (int row = 0;row<array.length;row++)
        {
            for (int col = 0;col < array[0].length;col++)
            {
                array[row][col] = row + col;
            }
        }
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][cols];

        for (int row = 0;row < rows;row++)
        {
            String[] inputTokens = scanner.nextLine().split(" ");
            for (int column = 0;column < cols;column ++)
            {
                matrix[row][column] = Integer.parseInt(inputTokens[column]);
            }
        }
        for (int row = 0;row < rows;row++)
        {
            for (int column = 0;column < cols;column ++)
            {
              System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}