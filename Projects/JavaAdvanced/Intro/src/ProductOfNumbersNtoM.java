import java.math.BigInteger;
import java.util.Scanner;

public class ProductOfNumbersNtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int nTemp = n;

        BigInteger product = BigInteger.ONE;

        do {
            BigInteger number = new BigInteger("" + nTemp);
            product = product.multiply(number);
            nTemp++;
        } while (nTemp <= m);

        System.out.printf("product[%d..%d] = %d%n", n, m, product);
    }
}
