import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSameValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> result = new HashMap<>();
        String[] input = scanner.nextLine().split("\\s+");

        for (String number : input) {
            if (!result.containsKey(number)) {
                result.put(number, 1);
            } else {
                result.put(number, result.get(number) + 1);
            }
        }

        for (String key : result.keySet()) {
            System.out.printf("%s - %d times%n", key, result.get(key));
        }
    }
}
