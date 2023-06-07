package PrimitiveDataType.simple;

public class FloatExample {
    public static void main(String[] args) {
        float pi = 3.14159f; // Оголошення та ініціалізація змінної типу float
        System.out.println("Pi: " + pi);

        float radius = 5.0f;
        float area = (float) (Math.PI * radius * radius); // Приведення типів для виконання обчислень
        System.out.println("Area: " + area);
    }
}