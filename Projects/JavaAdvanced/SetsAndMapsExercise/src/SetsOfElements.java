import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine()
                .split("\\s+");

        int firstSetCount = Integer.parseInt(input[0]);
        int secondSetCount = Integer.parseInt(input[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        fillSet(scanner, firstSetCount, firstSet);
        fillSet(scanner, secondSetCount, secondSet);

        StringBuilder result = new StringBuilder();
        for (Integer number : firstSet) {
            if (secondSet.contains(number)) {
                result.append(number).append(" ");
            }
        }

        if (!"".equals(result.toString())) {
            System.out.println(result.toString().trim());
        }
    }

    private static void fillSet(Scanner scanner, int length, Set<Integer> set) {
        for (int i = 0; i < length; i++) {
            set.add(Integer.parseInt(scanner.nextLine()));
        }
    }
}
