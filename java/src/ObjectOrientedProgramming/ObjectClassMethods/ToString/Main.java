package ObjectOrientedProgramming.ObjectClassMethods.ToString;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", 1960, 15.99);
        book1.addAuthor("Harper Lee");
        book1.addAuthor("Truman Capote");

        Book book2 = new Book("The Great Gatsby", 1925, 12.99);
        book2.addAuthor("F. Scott Fitzgerald");

        System.out.println(book1);
        System.out.println(book2);

        Order order = new Order(1001);
        order.addItem("Book", 2);
        order.addItem("Pen", 5);

        System.out.println(order);


    }
}

