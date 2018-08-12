import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new HashSet<>();

        String input;
        while (!"END".equals(input = scanner.nextLine())) {
            String[] tokens = input.split(", ");

            String direction = tokens[0];
            String carNumber = tokens[1];

            if ("IN".equals(direction)) {
                parkingLot.add(carNumber);
            } else {
                parkingLot.remove(carNumber);
            }
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : parkingLot) {
                System.out.println(carNumber);
            }
        }
    }
}
