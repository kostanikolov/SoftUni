import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pointA = scanner.nextLine().split("\\s+");
        String[] pointB = scanner.nextLine().split("\\s+");
        String[] pointC = scanner.nextLine().split("\\s+");

        int aX = Integer.parseInt(pointA[0]);
        int aY = Integer.parseInt(pointA[1]);

        int bX = Integer.parseInt(pointB[0]);
        int bY = Integer.parseInt(pointB[1]);

        int cX = Integer.parseInt(pointC[0]);
        int cY = Integer.parseInt(pointC[1]);

        //Ax(By−Cy)+Bx(Cy−Ay)+Cx(Ay−By)
        int area = (aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;

        System.out.println(Math.abs(area));
    }
}
