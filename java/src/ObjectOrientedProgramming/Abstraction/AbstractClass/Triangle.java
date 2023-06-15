package ObjectOrientedProgramming.Abstraction.AbstractClass;

// Похідний клас "Трикутник", який успадковує абстрактний клас "Фігура"
class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Реалізація методу для обчислення площі трикутника
    @Override
    public double getArea() {
        // Використовуємо формулу Герона для обчислення площі трикутника
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Реалізація методу для обчислення периметра трикутника
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}

