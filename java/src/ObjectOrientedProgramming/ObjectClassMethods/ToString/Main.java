package ObjectOrientedProgramming.ObjectClassMethods.ToString;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Убити пересмішника", 1960, 415.99);
        book1.addAuthor(" Гарпер Лі");
        book1.addAuthor("Труман Капот");

        Book book2 = new Book("Великий Гетсбі", 1925, 512.99);
        book2.addAuthor("Ф. Скотт Фіцджеральд");

        System.out.println(book1);
        System.out.println(book2);

        Order order = new Order(1001);
        order.addItem("Книжка", 2);
        order.addItem("Ручка", 5);

        System.out.println(order);

        Product product1 = new Product("Телефон", 7999.99);
        Product product2 = new Product("Ноутбук", 31499.99);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        System.out.println(cart.toString());


    }
}

