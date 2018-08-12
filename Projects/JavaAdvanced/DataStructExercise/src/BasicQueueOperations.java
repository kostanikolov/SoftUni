import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String[] numbers = scanner.nextLine().split("\\s+");

        int numbersToPush = Integer.parseInt(input[0]);
        int numbersToPop = Integer.parseInt(input[1]);
        String numberToCheck = input[2];

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < numbersToPush; i++) {
            queue.offer(numbers[i]);
        }

        for (int i = 0; i < numbersToPop; i++) {
            queue.poll();
        }

        if (queue.contains(numberToCheck)) {
            System.out.println("true");
        } else if (queue.isEmpty()){
            System.out.println(0);
        } else {
            System.out.println(findSmallestElement(queue));
        }
    }

    private static int findSmallestElement(ArrayDeque<String> numbers) {
        int smallestNum = Integer.MAX_VALUE;

        for (String number : numbers) {
            int n = Integer.parseInt(number);

            if (n < smallestNum) {
                smallestNum = n;
            }
        }

        return smallestNum;
    }
}
