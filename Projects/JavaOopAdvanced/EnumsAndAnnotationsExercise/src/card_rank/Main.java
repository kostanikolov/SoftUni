package card_rank;

public class Main {
    public static void main(String[] args) {

        RankType[] ranks = RankType.values();

        System.out.println("Card Ranks:");
        for (int ordinal = 0; ordinal < 13; ordinal++) {

            System.out.printf("Ordinal value: %d; Name value: %s%n",
                    ordinal,
                    ranks[ordinal].name());
        }
    }
}
