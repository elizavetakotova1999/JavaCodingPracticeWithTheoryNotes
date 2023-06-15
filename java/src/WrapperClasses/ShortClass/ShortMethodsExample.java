package WrapperClasses.ShortClass;

public class ShortMethodsExample {

    public static void main(String[] args) {
        // Створення обгортки Short зі значенням 10
        Short number = Short.valueOf((short) 10);

        // Виклик методу byteValue() - отримання значення як byte
        byte byteValue = number.byteValue();
        System.out.println("Значення як byte: " + byteValue);

        // Виклик статичного методу compare() - порівняння двох значень типу short
        short x = 20;
        short y = 30;
        int compareResult = Short.compare(x, y);
        System.out.println("Результат порівняння: " + compareResult);

        // Виклик методу compareTo() - порівняння двох об'єктів типу Short
        Short anotherNumber = Short.valueOf((short) 15);
        int compareToResult = number.compareTo(anotherNumber);
        System.out.println("Результат порівняння об'єктів: " + compareToResult);

        // Виклик статичного методу parseShort() - перетворення рядка на short
        String str = "25";
        short parsedShort = Short.parseShort(str);
        System.out.println("Рядок " + str + " перетворено на short: " + parsedShort);

        // Виклик методу doubleValue() - отримання значення як double
        double doubleValue = number.doubleValue();
        System.out.println("Значення як double: " + doubleValue);

        // Виклик методу equals() - порівняння двох об'єктів типу Short
        boolean equalsResult = number.equals(anotherNumber);
        System.out.println("Результат порівняння об'єктів: " + equalsResult);

        // Виклик методу floatValue() - отримання значення як float
        float floatValue = number.floatValue();
        System.out.println("Значення як float: " + floatValue);

        // Виклик методу hashCode() - отримання хеш-коду об'єкта
        int hashCode = number.hashCode();
        System.out.println("Хеш-код об'єкта: " + hashCode);

        // Виклик методу intValue() - отримання значення як int
        int intValue = number.intValue();
        System.out.println("Значення як int: " + intValue);

        // Виклик методу longValue() - отримання значення як long
        long longValue = number.longValue();
        System.out.println("Значення як long: " + longValue);

        // Виклик методу reverseBytes() - обертання байтів значення
        short reversedBytes = Short.reverseBytes(number);
        System.out.println("Значення з обернутими байтами: " + reversedBytes);

        // Виклик методу shortValue() - отримання значення як short
        short shortValue = number.shortValue();
        System.out.println("Значення як short: " + shortValue);

        // Виклик методу toString() - отримання рядкового представлення об'єкта
        String stringValue = number.toString();
        System.out.println("Рядкове представлення: " + stringValue);

        // Виклик статичного методу toUnsignedInt() - перетворення значення на беззнакове int
        int unsignedIntValue = Short.toUnsignedInt(number);
        System.out.println("Значення як беззнакове int: " + unsignedIntValue);

        // Виклик статичного методу toUnsignedLong() - перетворення значення на беззнакове long
        long unsignedLongValue = Short.toUnsignedLong(number);
        System.out.println("Значення як беззнакове long: " + unsignedLongValue);

        // Виклик статичного методу valueOf() - створення об'єкта Short зі значенням
        Short valueOfNumber = Short.valueOf((short) 5);
        System.out.println("Створений об'єкт Short: " + valueOfNumber);
    }
}
