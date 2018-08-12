import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
            String[] elementsInfo = scanner.nextLine().split("\\s+");

            for (int col = 0; col < matrixSize; col++) {
                matrix[row][col] = Integer.parseInt(elementsInfo[col]);
            }
        }

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        int row = 0;
        int primaryDiagonalColumn = 0;
        int secondaryDiagonalColumn = matrix.length - 1;

        while (row < matrix.length) {
            primaryDiagonalSum += matrix[row][primaryDiagonalColumn];
            secondaryDiagonalSum += matrix[row][secondaryDiagonalColumn];
            row++;
            primaryDiagonalColumn++;
            secondaryDiagonalColumn--;
        }

        int result = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);

        System.out.println(result);
    }
}
