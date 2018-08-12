package border_control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Identifiable> identifiables = new ArrayList<>();

        String line;
        while (!"End".equals(line = reader.readLine())) {

            String[] tokens = line.split("\\s+");

            Identifiable identifiable = null;
            if (tokens.length == 2) {
                String model = tokens[0];
                String id = tokens[1];

                identifiable = new Robot(model, id);

            } else if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];

                identifiable = new Citizen(name, age, id);
            }

            identifiables.add(identifiable);
        }

        String fakeId = reader.readLine();

        identifiables.stream()
                .filter(identifiable -> identifiable.getId().endsWith(fakeId))
                .forEach(identifiable -> System.out.println(identifiable.getId()));
    }
}
