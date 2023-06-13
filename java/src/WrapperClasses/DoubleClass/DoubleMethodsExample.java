package WrapperClasses.DoubleClass;

public class DoubleMethodsExample {
    public static void main(String[] args) {
        Double num1 = 3.14;
        Double num2 = 2.718;

        // Повертає значення цього Double як байт після примітивного перетворення.
        byte byteValue = num1.byteValue();
        System.out.println("byteValue: " + byteValue);

        // Порівнює два задані значення double.
        int compareResult = Double.compare(num1, num2);
        System.out.println("compareResult: " + compareResult);

        // Порівнює два числові об'єкти Double.
        int compareToResult = num1.compareTo(num2);
        System.out.println("compareToResult: " + compareToResult);

        // Повертає представлення заданого значення з плаваючою точкою за форматом "double" IEEE 754.
        long bits = Double.doubleToLongBits(num1);
        System.out.println("bits: " + bits);

        // Повертає значення double цього об'єкта Double.
        double doubleValue = num1.doubleValue();
        System.out.println("doubleValue: " + doubleValue);

        // Порівнює цей об'єкт з вказаним об'єктом.
        boolean equalsResult = num1.equals(num2);
        System.out.println("equalsResult: " + equalsResult);

        // Повертає значення цього Double як float після звуження примітивного перетворення.
        float floatValue = num1.floatValue();
        System.out.println("floatValue: " + floatValue);

        // Повертає хеш-код для цього об'єкта Double.
        int hashCode = num1.hashCode();
        System.out.println("hashCode: " + hashCode);

        // Повертає значення цього Double як int після звуження примітивного перетворення.
        int intValue = num1.intValue();
        System.out.println("intValue: " + intValue);

        // Повертає true, якщо аргумент є скінченним значенням з плаваючою точкою; повертає false у протилежному випадку (для NaN та нескінченостей).
        boolean isFiniteResult = Double.isFinite(num1);
        System.out.println("isFiniteResult: " + isFiniteResult);

        // Повертає true, якщо це значення Double є нескінчено великим за модулем, false у протилежному випадку.
        boolean isInfiniteResult = num1.isInfinite();
        System.out.println("isInfiniteResult: " + isInfiniteResult);

        // Повертає true, якщо це значення Double є NaN (Not-a-Number), false у протилежному випадку.
        boolean isNaNResult = num1.isNaN();
        System.out.println("isNaNResult: " + isNaNResult);

        // Повертає значення double, яке відповідає заданому бітовому представленню.
        double longBitsToDoubleValue = Double.longBitsToDouble(bits);
        System.out.println("longBitsToDoubleValue: " + longBitsToDoubleValue);

        // Повертає значення цього Double як long після звуження примітивного перетворення.
        long longValue = num1.longValue();
        System.out.println("longValue: " + longValue);

        // Повертає більше з двох значень double, якщо викликати Math.max.
        double maxResult = Double.max(num1, num2);
        System.out.println("maxResult: " + maxResult);

        // Повертає менше з двох значень double, якщо викликати Math.min.
        double minResult = Double.min(num1, num2);
        System.out.println("minResult: " + minResult);

        // Повертає рядкове представлення цього об'єкта Double.
        String toStringResult = num1.toString();
        System.out.println("toStringResult: " + toStringResult);

        // Повертає об'єкт Double, що представляє вказане значення double.
        Double valueOfResult = Double.valueOf(doubleValue);
        System.out.println("valueOfResult: " + valueOfResult);
    }
}
