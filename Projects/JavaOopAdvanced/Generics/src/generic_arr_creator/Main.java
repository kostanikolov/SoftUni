package generic_arr_creator;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.create(Integer.class, 10, 0);

        for (Integer integer : arr) {
            System.out.println(integer);
        }

        Object[] strings = ArrayCreator.create(10, "null");

        for (Object s : strings) {
            System.out.println(s);
        }
    }
}
