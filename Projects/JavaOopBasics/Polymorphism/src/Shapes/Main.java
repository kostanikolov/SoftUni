package Shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Shape circle = new Circle(2.45);
        Shape rect = new Rectangle(5, 10);

        System.out.println(circle.getArea());
        System.out.println(rect.getArea());
    }
}
