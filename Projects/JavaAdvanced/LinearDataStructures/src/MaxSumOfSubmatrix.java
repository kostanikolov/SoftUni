import java.util.Scanner;

public class MaxSumOfSubmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSizeInfo = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(matrixSizeInfo[0]);
        int cols = Integer.parseInt(matrixSizeInfo[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] elementsInfo = scanner.nextLine().split(", ");

            for (int column = 0; column < cols; column++) {
                matrix[row][column] = Integer.parseInt(elementsInfo[column]);
            }
        }

        int bestSum = Integer.MIN_VALUE;
        int resultRow = 0;
        int resultCol = 0;
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int column = 0; column < matrix[row].length - 1; column++) {
                int sum = matrix[row][column] + matrix[row][column + 1] +
                          matrix[row + 1][column] + matrix[row + 1][column + 1];

                if (sum > bestSum) {
                    bestSum = sum;
                    resultRow = row;
                    resultCol = column;
                }
            }
        }

        System.out.printf("%d %d%n", matrix[resultRow][resultCol], matrix[resultRow][resultCol + 1]);
        System.out.printf("%d %d%n", matrix[resultRow + 1][resultCol], matrix[resultRow + 1][resultCol + 1]);
        System.out.println(bestSum);
    }
}
