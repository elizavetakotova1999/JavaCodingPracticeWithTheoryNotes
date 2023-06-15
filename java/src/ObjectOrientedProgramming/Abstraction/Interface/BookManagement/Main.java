package ObjectOrientedProgramming.Abstraction.Interface.BookManagement;

// Файл: Main.java
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Пригоди Тома Сойєра", "Марк Твен");
        Book book2 = new Book("Війна і мир", "Лев Толстой");
        Book book3 = new Book("1984", "Джордж Орвелл");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBook(book2);

        library.displayBooks();
    }
}

