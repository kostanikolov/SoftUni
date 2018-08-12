import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = Arrays.asList(reader.readLine().split(" "));
        Set<Character> letters = new HashSet<>();

        Stream.of(reader.readLine().split(" "))
                .map(s -> s.toLowerCase().charAt(0))
                .forEach(c -> letters.add(c));

        Optional<String> first = names.stream()
                .filter(name -> letters.contains(name.toLowerCase().charAt(0)))
                .sorted()
                .findFirst();

        if (first.isPresent()) {
            System.out.println(first.get());
        } else {
            System.out.println("No match");
        }
    }
}
