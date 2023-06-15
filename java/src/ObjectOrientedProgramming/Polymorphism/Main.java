package ObjectOrientedProgramming.Polymorphism;

// Батьківський клас Shape
class Shape {
    public void draw() {
        System.out.println("Малюю фігуру");
    }
}

// Підклас Circle, успадковує клас Shape
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Малюю коло");
    }
}

// Підклас Rectangle, успадковує клас Shape
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Малюю прямокутник");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(); // Створення об'єкта Circle та присвоєння його змінній типу Shape
        Shape shape2 = new Rectangle(); // Створення об'єкта Rectangle та присвоєння його змінній типу Shape

        shape1.draw(); // Виклик методу draw() для об'єкта Circle
        shape2.draw(); // Виклик методу draw() для об'єкту Rectangle
    }
}
