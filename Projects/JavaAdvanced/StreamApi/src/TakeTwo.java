import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TakeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split(" ");

        Arrays.stream(numbers)
                .map(Integer::parseInt)
                .filter(x -> 10 <= x && x <= 20)
                .distinct()
                .limit(2)
                .forEach(x -> System.out.print(x + " "));

//        String[] input = reader.readLine().split(" ");
//        Set<Integer> list = new LinkedHashSet<>();
//
//        for (String integer : input) {
//            int num = Integer.parseInt(integer);
//
//            if (list.size() >= 2)
//                break;
//
//            if (num >= 10 && num <= 20)
//                list.add(num);
//        }
//
//        for (Integer integer : list) {
//            System.out.print(integer + " ");
//        }
//        System.out.println();
    }
}
