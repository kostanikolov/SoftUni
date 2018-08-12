import java.util.Scanner;

public class NumbersZeroToNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while (counter < 10) {
            System.out.printf("Number: %d%n", counter);
            counter++;
        }
    }
}
