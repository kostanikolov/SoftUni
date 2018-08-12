import java.util.ArrayList;
import java.util.Scanner;

public class GetOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split("\\s+");
        String[] tokens = scanner.nextLine().split("\\s+");

        int elementsToGet = Integer.parseInt(tokens[1]);
        String command = tokens[2];
        ArrayList<String> result = new ArrayList<>();

        if ("odd".equals(command)) {
            for (String element : elements) {
                if (Integer.parseInt(element) % 2 != 0) {
                    result.add(element);

                    if (result.size() == elementsToGet)
                        break;
                }
            }
        } else if ("even".equals(command)) {
            for (String element : elements) {
                if (Integer.parseInt(element) % 2 == 0) {
                    result.add(element);

                    if (result.size() == elementsToGet)
                        break;
                }
            }
        }

        System.out.println(String.join(" ", result));
    }
}
