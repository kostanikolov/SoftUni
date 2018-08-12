import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String line;
        while (!"search".equals(line = scanner.nextLine())) {
            String[] input = line.split("-");

            String name = input[0];
            String phoneNumber = input[1];

            phonebook.put(name, phoneNumber);
        }

        while (!"stop".equals(line = scanner.nextLine())) {
            if (phonebook.containsKey(line)) {
                System.out.printf("%s -> %s%n", line, phonebook.get(line));
            } else {
                System.out.printf("Contact %s does not exist.%n", line);
            }
        }
    }
}
