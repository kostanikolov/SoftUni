import java.util.Scanner;

public class FormattingNumbers {
    private static final int MAX_LENGTH = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int numA = Integer.parseInt(input[0]);
        double numB = Double.parseDouble(input[1]);
        double numC = Double.parseDouble(input[2]);

        String hex = String.format("%x", numA).toUpperCase();
        String binary = Integer.toBinaryString(numA);
        String numBFormatted = String.format("%.2f", numB);
        String numCFormatted = String.format("%.3f", numC);

        String result = String.format("|%s|%s|%s|%s|",
                getPadLeft(hex, " "),
                getPadRight(binary, "0"),
                getPadRight(numBFormatted, " "),
                getPadLeft(numCFormatted, " ")
        );

        System.out.println(result);
    }

    private static String getPadLeft(String string, String fill) {
        return string + new String(new char[MAX_LENGTH - string.length()]).replace("\0", fill);
    }

    private static String getPadRight(String string, String fill) {
        return new String(new char[MAX_LENGTH - string.length()]).replace("\0", fill) + string;
    }
}
