package ObjectOrientedProgramming.ObjectClassMethods.ToString;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> authors;
    private int year;
    private double price;

    public Book(String title, int year, double price) {
        this.title = title;
        this.year = year;
        this.price = price;
        this.authors = new ArrayList<>();
    }

    public void addAuthor(String author) {
        authors.add(author);
    }

    // Метод equals

    // Метод hashCode

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Назва: ").append(title).append("\n");
        sb.append("Автори: ").append(authors).append("\n");
        sb.append("Рік: ").append(year).append("\n");
        sb.append("Ціна: ₴").append(price).append("\n");
        return sb.toString();
    }
}
