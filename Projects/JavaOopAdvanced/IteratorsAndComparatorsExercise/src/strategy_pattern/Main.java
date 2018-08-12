package strategy_pattern;

import strategy_pattern.comparators.ComparatorByAge;
import strategy_pattern.comparators.ComparatorByNameLengthThenByNameFirstLetter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Set<Person> treeSetByName = new TreeSet<>(new ComparatorByNameLengthThenByNameFirstLetter());
        Set<Person> treeSetByAge = new TreeSet<>(new ComparatorByAge());

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            treeSetByName.add(person);
            treeSetByAge.add(person);
        }

        treeSetByName.forEach(System.out::println);
        treeSetByAge.forEach(System.out::println);
    }
}
