import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("^[A-Za-z0-9_-]{3,16}$");
        String text = scanner.nextLine();

        List<String> list = new ArrayList<>();

        while (!"END".equals(text)) {
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                list.add("valid");
            } else {
                list.add("invalid");
            }

            text = scanner.nextLine();
        }

        if (list.contains("valid")) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
