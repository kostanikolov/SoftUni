import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = Integer.valueOf(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double price = 0;

        if (distance < 20) {

            if ("day".equals(timeOfDay)) {
                price = 0.79 * distance + 0.70;
            } else {
                price = 0.90 * distance + 0.70;
            }
        } else if (distance < 100) {

            price = 0.09 * distance;
        } else {

            price = 0.06 * distance;
        }

        System.out.printf("%.2f", price);
    }
}
