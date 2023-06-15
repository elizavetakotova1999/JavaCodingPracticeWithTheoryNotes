package ObjectOrientedProgramming.Abstraction.AbstractClass;

// Абстрактний клас "Фігура"
abstract class Figure {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    // Абстрактні методи, які потрібно реалізувати в похідних класах
    public abstract double getArea();
    public abstract double getPerimeter();

    public void printColor() {
        System.out.println("Колір фігури: " + color);
    }
}
