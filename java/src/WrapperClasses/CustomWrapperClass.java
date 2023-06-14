package WrapperClasses;

/*
Приклад власного класу обгортки
  */

public class CustomWrapperClass {
    private int value; // Поле для зберігання цілого числа

    /**
     * Конструктор класу
     * @param value початкове значення для обгортки
     */
    public CustomWrapperClass(int value) {
        this.value = value;
    }

    /**
     * Отримати значення обгортки
     * @return ціле число
     */
    public int getValue() {
        return value;
    }

    /**
     * Встановити значення обгортки
     * @param value нове значення
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Збільшити значення обгортки на одиницю
     */
    public void increment() {
        value++;
    }

    /**
     * Зменшити значення обгортки на одиницю
     */
    public void decrement() {
        value--;
    }

    /**
     * Перевірити, чи є значення обгортки позитивним
     * @return true, якщо значення позитивне; false, якщо негативне або нульове
     */
    public boolean isPositive() {
        return value > 0;
    }

    /**
     * Перевірити, чи є значення обгортки негативним
     * @return true, якщо значення негативне; false, якщо позитивне або нульове
     */
    public boolean isNegative() {
        return value < 0;
    }

    /**
     * Перевірити, чи є значення обгортки нульовим
     * @return true, якщо значення нульове; false, якщо позитивне або негативне
     */
    public boolean isZero() {
        return value == 0;
    }

    /**
     * Перевизначений метод toString() для отримання рядкового представлення обгортки
     * @return рядкове представлення числа
     */
    public String toString() {
        return String.valueOf(value);
    }
}


