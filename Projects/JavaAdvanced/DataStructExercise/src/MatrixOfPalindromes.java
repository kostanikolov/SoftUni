import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixInfo = scanner.nextLine().split("\\s+");

        int r = Integer.parseInt(matrixInfo[0]);
        int c = Integer.parseInt(matrixInfo[1]);

        char a = 'a';
        char b = 'a';

        char[][] matrix = new char[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a);
                System.out.print(b);
                System.out.print(a + " ");
                b++;
            }
            System.out.println();
            a++;
            b = a;
        }
    }
}
