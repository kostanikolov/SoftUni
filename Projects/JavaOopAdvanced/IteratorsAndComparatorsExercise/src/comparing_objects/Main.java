package comparing_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> people = new ArrayList<>();

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person person = new Person(name, age, town);

            people.add(person);
        }

        int n = Integer.parseInt(reader.readLine());

        if (n < 0 || n >= people.size()) {
            System.out.println("No matches");
            return;
        }

        Person person = people.get(n);

        long countOfEqualPeople = people.stream()
                .filter(person1 -> person1.compareTo(person) == 0)
                .count();

        if (countOfEqualPeople == 0) {
            System.out.println("No matches");

        } else {
            System.out.printf("%d %d %d",
                    countOfEqualPeople,
                    people.size() - countOfEqualPeople,
                    people.size());
        }
    }
}
