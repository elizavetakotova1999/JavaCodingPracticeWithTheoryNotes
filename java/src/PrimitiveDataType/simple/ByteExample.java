package PrimitiveDataType.simple;

public class ByteExample {
    public static void main(String[] args) {
        byte age = 25; // Оголошення та ініціалізація змінної типу byte
        System.out.println("Age: " + age);

        byte min = Byte.MIN_VALUE; // Мінімальне значення для byte
        byte max = Byte.MAX_VALUE; // Максимальне значення для byte
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);
    }
}
