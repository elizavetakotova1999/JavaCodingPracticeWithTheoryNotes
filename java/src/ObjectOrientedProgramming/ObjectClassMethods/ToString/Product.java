package ObjectOrientedProgramming.ObjectClassMethods.ToString;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Товар: " + name + "\n"
                + "Ціна: ₴" + price;
    }
}

