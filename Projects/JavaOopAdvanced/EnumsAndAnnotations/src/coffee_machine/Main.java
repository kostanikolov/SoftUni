package coffee_machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        String line;
        while (!"END".equals(line = reader.readLine())) {
            String[] tokens = line.split("\\s+");

            if (tokens.length == 1) {
                String coin = tokens[0];
                coffeeMachine.insertCoin(coin);

            } else {
                String size = tokens[0];
                String type = tokens[1];

                coffeeMachine.buyCoffee(size, type);
            }
        }

        for (Coffee coffee : coffeeMachine.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}
