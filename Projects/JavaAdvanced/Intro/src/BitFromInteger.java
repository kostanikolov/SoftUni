import java.util.Scanner;

public class BitFromInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 12345;//scanner.nextInt();
        int p = 2;//scanner.nextInt();

        System.out.println("------------");
        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));

        int mask = n >> p;

        System.out.println(String.format("%32s", Integer.toBinaryString(mask)).replace(' ', '0') + " = mask");
        System.out.println(String.format("%32s", Integer.toBinaryString(1)).replace(' ', '0') + " = 1");

        int bit = mask & 1;

        System.out.println(String.format("%32s", Integer.toBinaryString(bit)).replace(' ', '0') + " = bit");

        System.out.println(bit);
    }
}
