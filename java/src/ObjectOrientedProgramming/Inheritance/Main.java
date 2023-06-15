package ObjectOrientedProgramming.Inheritance;

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів підкласів
        Car car = new Car("BMW", "Чорний", 4);
        Motorcycle motorcycle = new Motorcycle("Harley Davidson", "Червоний", true);

        // Виклик методів батьківського і підкласу
        car.start();
        car.accelerate();
        car.brake();
        car.openDoor();

        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.lean();
    }
}