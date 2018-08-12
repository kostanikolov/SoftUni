package cards_with_power;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String rank = reader.readLine();
        String suit = reader.readLine();

        try {
            Card card = new Card(rank, suit);

            System.out.printf("Card name: %s; Card power: %d%n",
                    card.toString(),
                    card.getPower());

        } catch (IllegalArgumentException ignored) {
        }
    }
}
