package list_utilities;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<Integer> integers = new ArrayList<>();
//        Collections.addAll(integers, 1, 2, 3);
//
//        List<Double> doubles = new ArrayList<>();
//        Collections.addAll(doubles, 7.2, 3.14, 6.18);
//
//        List<List<? extends Number>> jagged = new ArrayList<>();
//        Collections.addAll(jagged, integers, doubles);
//
//        List<Number> dest = new ArrayList<>();
//        ListUtils.flatten(dest, jagged);
//
//        for (Number number : dest) {
//            System.out.println(number);
//        }

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, null, 2, null);

        List<Double> doubles = new ArrayList<>();
        Collections.addAll(doubles, 7.2, 3.14, 6.18);

        List<Number> destination = new ArrayList<>();

        ListUtils.addAll(destination, integers);
        ListUtils.addAll(destination, doubles);

        System.out.println(destination);
    }
}
