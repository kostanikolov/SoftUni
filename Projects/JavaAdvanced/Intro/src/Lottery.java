import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int first = 1; first <= 8; first++) {
            for (int second = first + 1; second <= 9; second++) {
                for (int third = second + 1; third <= 10; third++) {
                    System.out.printf("%d %d %d%n", first, second, third);
                }
            }
        }
    }
}
