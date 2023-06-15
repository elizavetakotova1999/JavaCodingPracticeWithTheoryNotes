package ObjectOrientedProgramming.Abstraction.Interface.ShapeExample;

// Клас "Коло", який реалізує інтерфейс "Фігура"
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Реалізація методу для обчислення площі кола
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Реалізація методу для обчислення довжини кола
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
