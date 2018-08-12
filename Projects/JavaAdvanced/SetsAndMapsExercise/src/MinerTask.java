import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> result = new LinkedHashMap<>();

        while (true) {
            String resource = scanner.nextLine();
            if ("stop".equals(resource)) {
                break;
            }
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!result.containsKey(resource)) {
                result.put(resource, quantity);
            } else {
                result.put(resource, result.get(resource) + quantity);
            }
        }

        for (String resource : result.keySet()) {
            System.out.printf("%s -> %d%n", resource, result.get(resource));
        }
    }
}
