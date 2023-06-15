package ObjectOrientedProgramming.Encapsulation.Car;

/**
 * Клас, що представляє автомобіль.
 */
public class Car {
    private String brand;        // Марка автомобіля
    private String model;        // Модель автомобіля
    private int year;            // Рік випуску автомобіля
    private double fuelLevel;    // Рівень палива в баці автомобіля

    /**
     * Конструктор класу Car.
     *
     * @param brand       марка автомобіля
     * @param model       модель автомобіля
     * @param year        рік випуску автомобіля
     * @param initialFuel початковий рівень палива в баці автомобіля
     */
    public Car(String brand, String model, int year, double initialFuel) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuelLevel = initialFuel;
    }

    /**
     * Метод для запуску автомобіля.
     */
    public void start() {
        if (fuelLevel > 0) {
            System.out.println("Автомобіль " + brand + " " + model + " заведено.");
        } else {
            System.out.println("У автомобіля " + brand + " " + model + " немає палива.");
        }
    }

    /**
     * Метод для зупинки автомобіля.
     */
    public void stop() {
        System.out.println("Автомобіль " + brand + " " + model + " зупинено.");
    }

    /**
     * Метод для заправки автомобіля.
     *
     * @param fuelAmount кількість палива для заправки
     */
    public void refuel(double fuelAmount) {
        if (fuelAmount > 0) {
            fuelLevel += fuelAmount;
            System.out.println("Автомобіль " + brand + " " + model + " заправлено на " + fuelAmount + " л.");
        } else {
            System.out.println("Некоректна кількість палива для заправки.");
        }
    }

    /**
     * Метод для перевірки рівня палива в баці автомобіля.
     *
     * @return true, якщо рівень палива більше 0; false - в іншому випадку
     */
    public boolean hasFuel() {
        return fuelLevel > 0;
    }

    /**
     * Метод для отримання марки автомобіля.
     *
     * @return марка автомобіля
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Метод для отримання моделі автомобіля.
     *
     * @return модель автомобіля
     */
    public String getModel() {
        return model;
    }

    /**
     * Метод для отримання року випуску автомобіля.
     *
     * @return рік випуску автомобіля
     */
    public int getYear() {
        return year;
    }

    /**
     * Метод для отримання рівня палива в баці автомобіля.
     *
     * @return рівень палива
     */
    public double getFuelLevel() {
        return fuelLevel;
    }
}
