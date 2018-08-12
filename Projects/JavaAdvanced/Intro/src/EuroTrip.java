import java.math.BigDecimal;
import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double kg = scanner.nextDouble();
//
//        BigDecimal marksRate = new BigDecimal(4210500000000.0);
//        BigDecimal priceInLv = new BigDecimal(kg * 1.2);
//
//        BigDecimal result = marksRate.multiply(priceInLv);
//
//        System.out.printf("%.2f", result);


        double quantity = scanner.nextDouble();
        BigDecimal price = new BigDecimal(1.2 * quantity);
        BigDecimal exchangeRate = new BigDecimal(4210500000000.0);

        BigDecimal result = price.multiply(exchangeRate);

        System.out.printf("%.2f marks", result);
    }
}
