import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[0]);
        String method = input[1].toUpperCase();

        int[][] matrix = new int[rows][cols];

        if ("A".equals(method)) {
            firstPattern(matrix);
        } else {
            secondPattern(matrix);
        }

        printMatrix(matrix);
    }

    private static void firstPattern(int[][] matrix) {
        int currNum = 1;

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i] = currNum++;
            }
        }
    }

    private static void secondPattern(int[][] matrix) {
        int currNum = 1;

        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = currNum++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = currNum++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] nums : matrix) {
            for (int num : nums) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }
    }
}
