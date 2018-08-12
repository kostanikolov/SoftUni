package library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private int year;
    private List<String> authors;

    Book(String title, int year, String... authors) {
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    int getYear() {
        return this.year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private List<String> getAuthors() {
        return this.authors;
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    @Override
    public int compareTo(Book book) {
        if (this.getTitle().compareTo(book.getTitle()) == 0) {
            if (this.getYear() > book.getYear()) {
                return 1;
            } else if (this.getYear() < book.getYear()) {
                return -1;
            }

            return 0;

        } else {
            return this.getTitle().compareTo(book.getTitle());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s %d %s",
                this.getTitle(),
                this.getYear(),
                String.join(", ", this.getAuthors())));

        return sb.toString();
    }
}
