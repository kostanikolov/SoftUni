import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(String.format("%32s", Integer.toBinaryString(1)).replace(' ', '0'));
    }
}
