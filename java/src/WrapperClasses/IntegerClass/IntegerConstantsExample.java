package WrapperClasses.IntegerClass;

public class IntegerConstantsExample {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        int size = Integer.SIZE;
        int bytes = Integer.BYTES;
        Class<Integer> type = Integer.TYPE;

        System.out.println("Максимальне значення: " + maxValue);
        System.out.println("Мінімальне значення: " + minValue);
        System.out.println("Розмір типу: " + size);
        System.out.println("Кількість байтів: " + bytes);
        System.out.println("Тип: " + type);

    }
}
