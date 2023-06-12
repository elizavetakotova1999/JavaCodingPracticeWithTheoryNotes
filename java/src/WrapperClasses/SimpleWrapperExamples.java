package WrapperClasses;

public class SimpleWrapperExamples {
    public static void main(String[] args) {
        // Byte - обгортка для типу byte
        Byte byteValue = 10; // Створення об'єкту Byte зі значенням 10
        byte bytePrimitive = byteValue.byteValue(); // Отримання примітивного значення типу byte
        System.out.println("Byte value: " + byteValue);
        System.out.println("Byte primitive: " + bytePrimitive);

        // Short - обгортка для типу short
        Short shortValue = 100;
        short shortPrimitive = shortValue.shortValue();
        System.out.println("Short value: " + shortValue);
        System.out.println("Short primitive: " + shortPrimitive);

        // Integer - обгортка для типу int
        Integer intValue = 1000;
        int intPrimitive = intValue.intValue();
        System.out.println("Integer value: " + intValue);
        System.out.println("Integer primitive: " + intPrimitive);

        // Long - обгортка для типу long
        Long longValue = 10000L;
        long longPrimitive = longValue.longValue();
        System.out.println("Long value: " + longValue);
        System.out.println("Long primitive: " + longPrimitive);

        // Float - обгортка для типу float
        Float floatValue = 3.14f;
        float floatPrimitive = floatValue.floatValue();
        System.out.println("Float value: " + floatValue);
        System.out.println("Float primitive: " + floatPrimitive);

        // Double - обгортка для типу double
        Double doubleValue = 3.14159;
        double doublePrimitive = doubleValue.doubleValue();
        System.out.println("Double value: " + doubleValue);
        System.out.println("Double primitive: " + doublePrimitive);

        // Character - обгортка для типу char
        Character charValue = 'A';
        char charPrimitive = charValue.charValue();
        System.out.println("Character value: " + charValue);
        System.out.println("Character primitive: " + charPrimitive);

        // Boolean - обгортка для типу boolean
        Boolean booleanValue = true;
        boolean booleanPrimitive = booleanValue.booleanValue();
        System.out.println("Boolean value: " + booleanValue);
        System.out.println("Boolean primitive: " + booleanPrimitive);
    }
}