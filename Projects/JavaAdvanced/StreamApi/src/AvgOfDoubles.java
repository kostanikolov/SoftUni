import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;

public class AvgOfDoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] elements = reader.readLine().split(" ");

        OptionalDouble average = Arrays.stream(elements)
                .filter(n -> !n.isEmpty())
                .mapToDouble(Double::parseDouble)
                .average();

        if (average.isPresent()) {
            System.out.printf("%.2f", average.getAsDouble());
        } else {
            System.out.println("No match");
        }
    }
}
