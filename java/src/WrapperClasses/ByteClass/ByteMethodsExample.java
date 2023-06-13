package WrapperClasses.ByteClass;

public class ByteMethodsExample {

    public static void main(String[] args) {
        byte value1 = 10;
        byte value2 = 20;
        String strValue = "30";
        int radix = 16;

        // Повертає значення об'єкта типу Byte як примітивний тип byte.
        byte byteValue = Byte.valueOf(value1).byteValue();
        System.out.println("byteValue: " + byteValue);

        // Порівнює значення об'єкта типу Byte з іншим об'єктом типу Byte.
        int compareResult = Byte.compare(value1, value2);
        System.out.println("compareTo: " + compareResult);

        // Парсить рядок у відповідне значення типу byte.
        byte decodedValue = Byte.decode(strValue);
        System.out.println("decode: " + decodedValue);

        // Перевіряє, чи є об'єкт рівним зазначеному об'єкту.
        boolean equals = Byte.valueOf(value1).equals(Byte.valueOf(value2));
        System.out.println("equals: " + equals);

        // Повертає хеш-код для об'єкта типу Byte.
        int hashCode = Byte.valueOf(value1).hashCode();
        System.out.println("hashCode: " + hashCode);

        // Повертає значення об'єкта типу Byte як примітивний тип int.
        int intValue = Byte.valueOf(value1).intValue();
        System.out.println("intValue: " + intValue);

        //  Повертає значення об'єкта типу Byte як примітивний тип long.
        long longValue = Byte.valueOf(value1).longValue();
        System.out.println("longValue: " + longValue);

        // Парсить рядок у відповідне значення типу byte.
        byte parsedByte = Byte.parseByte(strValue);
        System.out.println("parseByte: " + parsedByte);

        // Парсить рядок у відповідне значення типу byte з вказаною системою числення.
        byte parsedByteWithRadix = Byte.parseByte(strValue, radix);
        System.out.println("parseByte (with radix): " + parsedByteWithRadix);

        // Повертає значення об'єкта типу Byte як примітивний тип short.
        short shortValue = Byte.valueOf(value1).shortValue();
        System.out.println("shortValue: " + shortValue);

        //  Повертає рядкове представлення об'єкта типу Byte.
        String stringValue = Byte.valueOf(value1).toString();
        System.out.println("toString: " + stringValue);

        // Повертає рядкове представлення переданого значення типу byte.
        String stringValueOfByte = Byte.toString(value1);
        System.out.println("toString (of byte): " + stringValueOfByte);

        //  Перетворює значення типу byte на беззнакове ціле значення типу int.
        int unsignedIntValue = Byte.toUnsignedInt(value1);
        System.out.println("toUnsignedInt: " + unsignedIntValue);

        // Перетворює значення типу byte на беззнакове ціле значення типу long.
        long unsignedLongValue = Byte.toUnsignedLong(value1);
        System.out.println("toUnsignedLong: " + unsignedLongValue);
    }
}
