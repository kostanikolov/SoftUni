package generic_scale;

public class Main {
    public static void main(String[] args) {

        Scale<Integer> integerScale = new Scale<>(6, 10);

        System.out.println(integerScale.getHeavier());
    }
}
