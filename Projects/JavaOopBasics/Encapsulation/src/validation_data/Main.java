package validation_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int peopleCount = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();


        while (peopleCount-- > 0) {
            try {
                String[] tokens = reader.readLine().split("\\s+");

                String firstName = tokens[0];
                String lastName = tokens[1];
                int age = Integer.parseInt(tokens[2]);
                double salary = Double.parseDouble(tokens[3]);

                people.add(new Person(firstName, lastName, age, salary));

            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        int bonus = Integer.parseInt(reader.readLine());

        people.forEach(person -> {
            person.increaseSalary(bonus);
            System.out.println(person);
        });
    }
}
