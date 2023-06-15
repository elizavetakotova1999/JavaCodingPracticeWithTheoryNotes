package ObjectOrientedProgramming.Abstraction.Interface.ShapeExample;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта класу "Прямокутник"
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Виклик методів для об'єкта класу "Прямокутник"
        System.out.println("Площа прямокутника: " + rectangle.getArea());
        System.out.println("Периметр прямокутника: " + rectangle.getPerimeter());

        // Створення об'єкта класу "Коло"
        Circle circle = new Circle(3.0);

        // Виклик методів для об'єкта класу "Коло"
        System.out.println("Площа кола: " + circle.getArea());
        System.out.println("Довжина кола: " + circle.getPerimeter());
    }
}

