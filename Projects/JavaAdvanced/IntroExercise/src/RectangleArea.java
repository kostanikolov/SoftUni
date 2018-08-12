import java.math.BigDecimal;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal sideA = new BigDecimal(scanner.next());
        BigDecimal sideB = new BigDecimal(scanner.next());

        BigDecimal area = sideA.multiply(sideB);

        System.out.printf("%.2f", area);
    }
}
