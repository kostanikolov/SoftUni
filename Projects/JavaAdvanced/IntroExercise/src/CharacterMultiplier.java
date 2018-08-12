import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String firstWord = input[0];
        String secondWord = input[1];

        int result = 0;
        int loopLength = Math.min(firstWord.length(), secondWord.length());

        for (int i = 0; i < loopLength; i++) {
            result += firstWord.charAt(i) * secondWord.charAt(i);
        }

        if (firstWord.length() > secondWord.length()) {
            for (int i = loopLength; i < firstWord.length(); i++) {
                result += firstWord.charAt(i);
            }
        } else if (secondWord.length() > firstWord.length()) {
            for (int i = loopLength; i < secondWord.length(); i++) {
                result += secondWord.charAt(i);
            }
        }

        System.out.println(result);
    }
}
