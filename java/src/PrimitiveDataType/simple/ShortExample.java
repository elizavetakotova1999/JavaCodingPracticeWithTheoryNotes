package PrimitiveDataType.simple;

public class ShortExample {
    public static void main(String[] args) {
        short temperature = -10; // Оголошення та ініціалізація змінної типу short
        System.out.println("Temperature: " + temperature);

        short minValue = Short.MIN_VALUE; // Мінімальне значення для short
        short maxValue = Short.MAX_VALUE; // Максимальне значення для short
        System.out.println("Min value: " + minValue);
        System.out.println("Max value: " + maxValue);
    }
}