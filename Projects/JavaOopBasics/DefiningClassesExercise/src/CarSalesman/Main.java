package CarSalesman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Engine> engines = new LinkedHashMap<>();
        List<Car> cars = new ArrayList<>();

        int enginesCount = Integer.parseInt(reader.readLine());
        while (enginesCount-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String model = tokens[0];
            int power = Integer.parseInt(tokens[1]);

            Engine engine = null;
            switch (tokens.length) {
                case 2:
                    engine = new Engine(model, power);
                    break;
                case 3:
                    boolean hasDisplacement = tokens[2].matches("\\d+");

                    if (hasDisplacement) {
                        int displacement = Integer.parseInt(tokens[2]);
                        engine = new Engine(model, power, displacement);
                    } else {
                        String efficiency = tokens[2];
                        engine = new Engine(model, power, efficiency);
                    }
                    break;
                case 4:
                    int displacement = Integer.parseInt(tokens[2]);
                    String efficiency = tokens[3];
                    engine = new Engine(model, power, displacement, efficiency);
                    break;
            }

            engines.putIfAbsent(model, engine);
        }

        int carsCount = Integer.parseInt(reader.readLine());
        while (carsCount-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String model = tokens[0];
            Engine engine = engines.get(tokens[1]);

            Car car = null;

            switch (tokens.length) {
                case 2:
                    car = new Car(model, engine);
                    break;
                case 3:
                    boolean hasWeight = tokens[2].matches("\\d+");

                    if (hasWeight) {
                        int weight = Integer.parseInt(tokens[2]);
                        car = new Car(model, engine, weight);
                    } else {
                        String color = tokens[2];
                        car = new Car(model, engine, color);
                    }
                    break;
                case 4:
                    int weight = Integer.parseInt(tokens[2]);
                    String color = tokens[3];
                    car = new Car(model, engine, weight, color);
                    break;
            }

            cars.add(car);
        }

        cars.forEach(x -> System.out.println(x + System.lineSeparator()));
    }
}
