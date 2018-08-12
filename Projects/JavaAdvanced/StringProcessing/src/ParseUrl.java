import java.util.Scanner;

public class ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] reminder = input.split("://");

        if (reminder.length != 2) {
            System.out.println("Invalid URL");
            return;
        }

        int serverEndIndex = reminder[1].indexOf("/");
        String protocol = reminder[0];
        String server = reminder[1].substring(0, serverEndIndex);
        String resources = reminder[1].substring(serverEndIndex + 1);

        System.out.printf("Protocol = %s%n", protocol);
        System.out.printf("Server = %s%n", server);
        System.out.printf("Resources = %s%n", resources);
    }
}
