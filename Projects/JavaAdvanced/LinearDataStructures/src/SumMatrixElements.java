import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSizeInfo = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(matrixSizeInfo[0]);
        int cols = Integer.parseInt(matrixSizeInfo[1]);

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int row = 0; row < rows; row++) {
            String[] elementsInfo = scanner.nextLine().split(", ");

            for (int column = 0; column < cols; column++) {
                matrix[row][column] = Integer.parseInt(elementsInfo[column]);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
