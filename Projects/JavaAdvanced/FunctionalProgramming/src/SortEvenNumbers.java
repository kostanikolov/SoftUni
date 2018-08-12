import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(", ");
        List<Integer> numbers = new ArrayList<>();

        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        numbers.removeIf(n -> n % 2 != 0);
        System.out.println(String.join(", ", numbers.toString()).replaceAll("[\\[\\]]", ""));

        numbers.sort(Integer::compareTo);
        //System.out.println(String.join(", ", numbers.toString()).replaceAll("[\\[\\]]", ""));

        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
