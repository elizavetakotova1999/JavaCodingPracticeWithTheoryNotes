package WrapperClasses.DoubleClass;

public class DoubleConstantsExample {

    public static void main(String[] args) {
        // Позитивна нескінченність
        double positiveInfinity = Double.POSITIVE_INFINITY;
        // Негативна нескінченність
        double negativeInfinity = Double.NEGATIVE_INFINITY;
        // Не число (NaN)
        double nan = Double.NaN;
        // Максимальне допустиме значення
        double maxValue = Double.MAX_VALUE;
        // Мінімальне допустиме ненульове значення
        double minValue = Double.MIN_VALUE;
        // Мінімальне нормалізоване значення
        double epsilon = Double.MIN_NORMAL;

        // Виведення значень констант
        System.out.println("Позитивна нескінченність: " + positiveInfinity);
        System.out.println("Негативна нескінченність: " + negativeInfinity);
        System.out.println("NaN: " + nan);
        System.out.println("Максимальне значення: " + maxValue);
        System.out.println("Мінімальне значення: " + minValue);
        System.out.println("Іпсилон: " + epsilon);
    }
}
