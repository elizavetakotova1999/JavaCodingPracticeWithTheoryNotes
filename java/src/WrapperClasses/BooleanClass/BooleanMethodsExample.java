package WrapperClasses.BooleanClass;

public class BooleanMethodsExample {
    public static void main(String[] args) {
        // Створення об'єкта Boolean зі значенням TRUE
        Boolean bool = Boolean.TRUE;
        boolean value = bool.booleanValue();
        System.out.println("booleanValue(): " + value);

        // Порівняння двох значень типу Boolean
        int compareResult = Boolean.compare(Boolean.TRUE, Boolean.FALSE);
        System.out.println("compare(): " + compareResult);

        // Порівняння поточного об'єкта Boolean з іншим об'єктом Boolean
        int compareToResult = Boolean.TRUE.compareTo(Boolean.FALSE);
        System.out.println("compareTo(): " + compareToResult);

        // Перевірка рівності двох об'єктів Boolean
        boolean equalsResult = Boolean.TRUE.equals(Boolean.FALSE);
        System.out.println("equals(): " + equalsResult);

        // Отримання значення boolean з системної властивості
        boolean getBooleanResult = Boolean.getBoolean("true");
        System.out.println("getBoolean(): " + getBooleanResult);

        // Обчислення хеш-коду об'єкта Boolean
        int hashCodeResult = Boolean.TRUE.hashCode();
        System.out.println("hashCode(): " + hashCodeResult);

        // Логічне "І" між двома значеннями типу Boolean
        boolean logicalAndResult = Boolean.logicalAnd(Boolean.TRUE, Boolean.FALSE);
        System.out.println("logicalAnd(): " + logicalAndResult);

        // Логічне "АБО" між двома значеннями типу Boolean
        boolean logicalOrResult = Boolean.logicalOr(Boolean.TRUE, Boolean.FALSE);
        System.out.println("logicalOr(): " + logicalOrResult);

        // Логічне "Виключне АБО" між двома значеннями типу Boolean
        boolean logicalXorResult = Boolean.logicalXor(Boolean.TRUE, Boolean.FALSE);
        System.out.println("logicalXor(): " + logicalXorResult);

        // Парсинг рядка у значення типу boolean
        boolean parseBooleanResult = Boolean.parseBoolean("true");
        System.out.println("parseBoolean(): " + parseBooleanResult);

        // Перетворення об'єкта Boolean у рядкове представлення
        String toStringResult = Boolean.TRUE.toString();
        System.out.println("toString(): " + toStringResult);

        // Створення об'єкта Boolean на основі рядкового значення
        Boolean valueOfResult = Boolean.valueOf("true");
        System.out.println("valueOf(): " + valueOfResult);
    }
}

