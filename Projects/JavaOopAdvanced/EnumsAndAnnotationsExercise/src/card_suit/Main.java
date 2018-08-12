package card_suit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        SuitType[] suits = SuitType.values();

        System.out.println("Card Suits:");
        for (int ordinal = 0; ordinal < 4; ordinal++) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", ordinal, suits[ordinal]);
        }

//        SuitType clubs = SuitType.CLUBS;
//        SuitType diamonds = SuitType.DIAMONDS;
//        SuitType hearts = SuitType.HEARTS;
//        SuitType spades = SuitType.SPADES;
//
//        System.out.println("Card Suits:");
//        System.out.printf("Ordinal value: %d; Name value: %s%n", clubs.ordinal(), clubs.name());
//        System.out.printf("Ordinal value: %d; Name value: %s%n", diamonds.ordinal(), diamonds.name());
//        System.out.printf("Ordinal value: %d; Name value: %s%n", hearts.ordinal(), hearts.name());
//        System.out.printf("Ordinal value: %d; Name value: %s%n", spades.ordinal(), spades.name());
    }
}
