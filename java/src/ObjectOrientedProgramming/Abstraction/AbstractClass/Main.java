package ObjectOrientedProgramming.Abstraction.AbstractClass;


public class Main {
    public static void main(String[] args) {
        // Створення об'єкта класу "Трикутник"
        Triangle triangle = new Triangle("Зелений", 3.0, 4.0, 5.0);

        // Виклик методів для об'єкта класу "Трикутник"
        triangle.printColor();
        System.out.println("Площа трикутника: " + triangle.getArea());
        System.out.println("Периметр трикутника: " + triangle.getPerimeter());
    }
}