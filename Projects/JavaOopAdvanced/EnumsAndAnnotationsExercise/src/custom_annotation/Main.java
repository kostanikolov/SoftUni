package custom_annotation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String OUTPUT = "Type = %s, Description = %s";
    private static final String RANK_TYPE = "Rank";
    private static final String SUIT_TYPE = "Suit";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        if (RANK_TYPE.equals(input)) {
            Class<RankType> rankTypeClass = RankType.class;
            printAnnotation(rankTypeClass);

        } else if (SUIT_TYPE.equals(input)) {
            Class<SuitType> suitTypeClass = SuitType.class;
            printAnnotation(suitTypeClass);
        }
    }

    private static void printAnnotation(Class<?> _class) {
        CustomEnumAnnotation annotation = _class.getAnnotation(CustomEnumAnnotation.class);

        System.out.printf(OUTPUT,
                annotation.type(),
                annotation.description());
    }
}
