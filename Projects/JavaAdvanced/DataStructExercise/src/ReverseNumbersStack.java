import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String number : numbers) {
            stack.push(number);
        }

        while (stack.size() > 0) {
            System.out.print(stack.pop() + " ");
        }
    }
}
