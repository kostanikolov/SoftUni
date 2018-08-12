import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();

        Map<Character, Integer> symbolsCount = new TreeMap<>();

        for (char currChar : input) {
            if (!symbolsCount.containsKey(currChar)) {
                symbolsCount.put(currChar, 1);
            } else {
                symbolsCount.put(currChar, symbolsCount.get(currChar) + 1);
            }
        }

        for (Character character : symbolsCount.keySet()) {
            System.out.printf("%c: %d time/s%n", character, symbolsCount.get(character));
        }
    }
}
