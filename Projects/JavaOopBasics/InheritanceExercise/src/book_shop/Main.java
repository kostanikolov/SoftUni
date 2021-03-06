package book_shop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.lang.instrument.IllegalClassFormatException;

public class Main {
    public static void main(String[] args)

            throws IllegalClassFormatException,
            IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String author = reader.readLine();
            String title = reader.readLine();
            double price = Double.valueOf(reader.readLine());

            Book book = new Book(
                    author,
                    title,
                    price);

            GoldenEditionBook goldenEditionBook =
                    new GoldenEditionBook(author,
                            title,
                            price);

            Method[] goldenBookDeclaredMethods =
                    GoldenEditionBook.class.getDeclaredMethods();

            if (goldenBookDeclaredMethods.length > 1) {
                throw new IllegalClassFormatException(
                        "Code duplication in GoldenEditionBook!");
            }

            System.out.println(book.toString());
            System.out.println(goldenEditionBook.toString());

        } catch (IllegalArgumentException | IllegalClassFormatException error) {
            System.out.println(error.getMessage());
        }
    }
}
