package ObjectOrientedProgramming.Abstraction.Interface.BookManagement;

// Файл: Library.java
import java.util.ArrayList;
import java.util.List;

public class Library implements BookManagement {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга '" + book.getTitle() + "' автора " + book.getAuthor() + " додана до каталогу.");
    }

    @Override
    public void removeBook(Book book) {
        boolean removed = books.remove(book);
        if (removed) {
            System.out.println("Книга '" + book.getTitle() + "' автора " + book.getAuthor() + " видалена з каталогу.");
        } else {
            System.out.println("Книга не знайдена в каталозі.");
        }
    }

    @Override
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Каталог порожній.");
        } else {
            System.out.println("Книги в каталозі:");
            for (Book book : books) {
                System.out.println(" - '" + book.getTitle() + "' автора " + book.getAuthor());
            }
        }
    }
}

