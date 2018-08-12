import java.util.Scanner;

public class ModifyBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int v = scanner.nextInt();

        int mask;
        int result;

        if (v == 0) {
            mask = ~(1 << p);
            result = n & mask;
        } else {
            mask = 1 << p;
            result = n | mask;
        }

        System.out.println(result);
    }
}
