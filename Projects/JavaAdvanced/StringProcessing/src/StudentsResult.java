import java.util.Scanner;

public class StudentsResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] student = scanner.nextLine().split("[ \\-,]+");

        String name = student[0];
        double[] grades = {
                Double.parseDouble(student[1]),
                Double.parseDouble(student[2]),
                Double.parseDouble(student[3])
        };

        double jAdv = grades[0];
        double javaOop = grades[1];
        double advOop = grades[2];
        double average = (jAdv + javaOop + advOop) / 3;

        String subjects = String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|",
                "Name", "JAdv", "JavaOOP", "AdvOOP", "Average");

        String results = String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",
                name, jAdv, javaOop, advOop, average);

        System.out.println(subjects);
        System.out.println(results);
    }
}
