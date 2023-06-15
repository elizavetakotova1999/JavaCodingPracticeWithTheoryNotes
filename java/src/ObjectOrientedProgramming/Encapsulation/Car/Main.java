package ObjectOrientedProgramming.Encapsulation.Car;

public class Main {
    public static void main(String[] args) {
        // Створення об'єкта класу Car
        Car myCar = new Car("Toyota", "Camry", 2021, 10.5);

        // Виведення інформації про автомобіль
        System.out.println("Марка: " + myCar.getBrand());
        System.out.println("Модель: " + myCar.getModel());
        System.out.println("Рік випуску: " + myCar.getYear());
        System.out.println("Рівень палива: " + myCar.getFuelLevel());

        // Запуск автомобіля
        myCar.start();

        // Заправка автомобіля
        myCar.refuel(20.5);

        // Перевірка рівня палива
        if (myCar.hasFuel()) {
            System.out.println("Автомобіль має паливо.");
        } else {
            System.out.println("У автомобіля немає палива.");
        }

        // Зупинка автомобіля
        myCar.stop();
    }
}
