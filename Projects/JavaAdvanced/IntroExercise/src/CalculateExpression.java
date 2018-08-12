import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double num1 = Double.parseDouble(input[0]);
        double num2 = Double.parseDouble(input[1]);
        double num3 = Double.parseDouble(input[2]);

        //double n = (Math.pow(num1, 2) + Math.pow(num2, 2)) / (Math.pow(num1, 2) - Math.pow(num2, 2));

        double f1 = Math.pow((Math.pow(num1, 2) + Math.pow(num2, 2)) / (Math.pow(num1, 2) - Math.pow(num2, 2)), (num1 + num2 + num3) / Math.sqrt(num3));
        double f2 = Math.pow(Math.pow(num1, 2) + Math.pow(num2, 2) - Math.pow(num3, 3), (num1 - num2));

        double avgOfThreeNums = (num1 + num2 + num3) / 3;
        double avgOfTwoFunc = (f1 + f2) / 2;
        double abs = Math.abs(avgOfThreeNums - avgOfTwoFunc);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1, f2, abs);

    }
}
