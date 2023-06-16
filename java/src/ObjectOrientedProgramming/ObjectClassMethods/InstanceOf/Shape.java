package ObjectOrientedProgramming.ObjectClassMethods.InstanceOf;

abstract class Shape {
    abstract double getArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }
}

class ShapeExample {
    public static void main(String[] args) {
        // Створюємо масив об'єктів типу Shape
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 8);

        // Обходимо кожен елемент масиву та виконуємо відповідні дії
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                // Якщо елемент є об'єктом типу Circle, то виконуємо наступні дії
                Circle circle = (Circle) shape; // Приведення типу
                System.out.println("Площа кола: " + circle.getArea());
            } else if (shape instanceof Rectangle) {
                // Якщо елемент є об'єктом типу Rectangle, то виконуємо наступні дії
                Rectangle rectangle = (Rectangle) shape; // Приведення типу
                System.out.println("Площа прямокутника: " + rectangle.getArea());
            } else if (shape instanceof Triangle) {
                // Якщо елемент є об'єктом типу Triangle, то виконуємо наступні дії
                Triangle triangle = (Triangle) shape; // Приведення типу
                System.out.println("Площа трикутника: " + triangle.getArea());
            }
        }
    }
}
