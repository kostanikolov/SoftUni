import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();


        String line;
        while (!"exit".equals(line = scanner.nextLine())) {
            String[] tokens = line.split("\\s+");

            String country = tokens[0];
            String city = tokens[1];
            int population = Integer.parseInt(tokens[2]);

            if (!map.containsKey(country)) {
                map.put(country, new LinkedHashMap<>());
            }

            if (!map.get(country).containsKey(city)) {
                map.get(country).put(city, population);
            } else {
                int incrValue = map.get(country).get(city) + population;
                map.get(country).put(city, incrValue);
            }
        }

        for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {

            String country = entry.getKey();
            System.out.println(country);

            Map<String, Integer> cities = entry.getValue();

            for (Map.Entry<String, Integer> city : cities.entrySet()) {

                System.out.printf("=> %s - (population: %d)%n", city.getKey(), city.getValue());
            }
            System.out.println();
        }
    }
}