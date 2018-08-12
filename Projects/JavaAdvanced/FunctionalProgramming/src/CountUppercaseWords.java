import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] text = reader.readLine().split("\\s+");

        List<String> result = new ArrayList<>();

        Predicate<String> isUppercase = word -> {
            return word.charAt(0) == word.toUpperCase().charAt(0);
        };

        for (String word : text) {
            if (isUppercase.test(word)) {
                result.add(word);
            }
        }

        System.out.println(result.size());
        for (String word : result) {
            System.out.println(word);
        }

    }
}
