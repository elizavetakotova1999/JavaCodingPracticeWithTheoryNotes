package ObjectOrientedProgramming.Abstraction.Interface.ShapeExample;

// Клас "Прямокутник", який реалізує інтерфейс "Фігура"
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Реалізація методу для обчислення площі прямокутника
    @Override
    public double getArea() {
        return length * width;
    }

    // Реалізація методу для обчислення периметра прямокутника
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
