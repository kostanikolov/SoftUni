import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }

        int incr = 0;
        for (String name : names) {
            int currNameSum = 0;

            for (int i = 0; i < name.length(); i++) {
                char currLetter = name.charAt(i);

                if (checkLetterIsVowel(currLetter)) {
                    currNameSum += currLetter * name.length();
                } else {
                    currNameSum += currLetter / name.length();
                }
            }

            result[incr++] = currNameSum;
        }

        Arrays.sort(result);

        for (int i : result) {
            System.out.println(i);
        }
    }

    private static boolean checkLetterIsVowel(char letter) {
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
            if (Character.toLowerCase(letter) == vowel) {
                return true;
            }
        }

        return false;
    }
}
