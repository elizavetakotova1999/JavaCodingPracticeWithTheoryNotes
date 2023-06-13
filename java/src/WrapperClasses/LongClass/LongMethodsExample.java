package WrapperClasses.LongClass;

public class LongMethodsExample {

    public static void main(String[] args) {
        long value1 = 10L;
        long value2 = 20L;
        String strValue = "30";
        int radix = 16;

        // bitCount(long value): Повертає кількість встановлених бітів в переданому значенні типу long.
        int bitCount = Long.bitCount(value1);
        System.out.println("bitCount: " + bitCount);

        // compare(long x, long y): Порівнює два значення типу long.
        int compareResult = Long.compare(value1, value2);
        System.out.println("compare: " + compareResult);

        // compareUnsigned(long x, long y): Порівнює два значення типу long як беззнакові числа.
        int compareUnsignedResult = Long.compareUnsigned(value1, value2);
        System.out.println("compareUnsigned: " + compareUnsignedResult);

        // decode(String s): Парсить рядок у відповідне значення типу long.
        long decodedValue = Long.decode(strValue);
        System.out.println("decode: " + decodedValue);


        // getLong(String nm): Повертає значення системної властивості з вказаним ім'ям як об'єкт типу Long.
        Long systemPropertyValue = Long.getLong("someSystemProperty");
        System.out.println("getLong: " + systemPropertyValue);

        // getLong(String nm, long val): Повертає значення системної властивості з вказаним ім'ям як об'єкт типу Long, або задане значення за замовчуванням, якщо властивість не знайдена.
        Long systemPropertyOrDefault = Long.getLong("someSystemProperty", 0L);
        System.out.println("getLong (with default): " + systemPropertyOrDefault);

        // hashCode(): Повертає хеш-код для цього об'єкта типу Long.
        int hashCode = Long.hashCode(value1);
        System.out.println("hashCode: " + hashCode);

        // highestOneBit(long value): Повертає значення, що містить лише найстарший встановлений біт переданого значення типу long.
        long highestOneBit = Long.highestOneBit(value1);
        System.out.println("highestOneBit: " + highestOneBit);


        // lowestOneBit(long value): Повертає значення, що містить лише найменший встановлений біт переданого значення типу long.
        long lowestOneBit = Long.lowestOneBit(value1);
        System.out.println("lowestOneBit: " + lowestOneBit);

        // max(long a, long b): Повертає більше з двох значень типу long.
        long maxValue = Long.max(value1, value2);
        System.out.println("max: " + maxValue);

        // min(long a, long b): Повертає менше з двох значень типу long.
        long minValue = Long.min(value1, value2);
        System.out.println("min: " + minValue);

        // numberOfLeadingZeros(long value): Повертає кількість нулів у початку значення типу long (враховуючи знаковий біт).
        int leadingZeros = Long.numberOfLeadingZeros(value1);
        System.out.println("numberOfLeadingZeros: " + leadingZeros);

        // numberOfTrailingZeros(long value): Повертає кількість нулів у кінці значення типу long.
        int trailingZeros = Long.numberOfTrailingZeros(value1);
        System.out.println("numberOfTrailingZeros: " + trailingZeros);

        // parseLong(String s): Парсить рядок у відповідне значення типу long.
        long parsedValue = Long.parseLong(strValue);
        System.out.println("parseLong: " + parsedValue);

        // parseLong(String s, int radix): Парсить рядок у відповідне значення типу long з вказаною системою числення.
        long parsedValueWithRadix = Long.parseLong(strValue, radix);
        System.out.println("parseLong (with radix): " + parsedValueWithRadix);

        // remainderUnsigned(long dividend, long divisor): Повертає остачу від цілочисельного ділення двох беззнакових значень типу long.
        long remainderUnsigned = Long.remainderUnsigned(value1, value2);
        System.out.println("remainderUnsigned: " + remainderUnsigned);

        // reverse(long value): Перевертає біти в переданому значенні типу long.
        long reversedValue = Long.reverse(value1);
        System.out.println("reverse: " + reversedValue);

        // reverseBytes(long value): Перевертає байти в переданому значенні типу long.
        long reversedBytesValue = Long.reverseBytes(value1);
        System.out.println("reverseBytes: " + reversedBytesValue);

        // rotateLeft(long value, int distance): Робить циклічний зсув вліво над переданим значенням типу long на вказану кількість позицій.
        long rotatedLeft = Long.rotateLeft(value1, 4);
        System.out.println("rotateLeft: " + rotatedLeft);

        // rotateRight(long value, int distance): Робить циклічний зсув вправо над переданим значенням типу long на вказану кількість позицій.
        long rotatedRight = Long.rotateRight(value1, 4);
        System.out.println("rotateRight: " + rotatedRight);


        // signum(long value): Повертає знак переданого значення типу long (-1 для від'ємного значення, 0 для нульового значення, 1 для додатнього значення).
        int signum = Long.signum(value1);
        System.out.println("signum: " + signum);

        // sum(long a, long b): Повертає суму двох значень типу long.
        long sum = Long.sum(value1, value2);
        System.out.println("sum: " + sum);

        // toBinaryString(long value): Повертає рядок, що представляє передане значення типу long у двійковій системі числення.
        String binaryString = Long.toBinaryString(value1);
        System.out.println("toBinaryString: " + binaryString);

        // toHexString(long value): Повертає рядок, що представляє передане значення типу long у шістнадцятковій системі числення.
        String hexString = Long.toHexString(value1);
        System.out.println("toHexString: " + hexString);

        // toOctalString(long value): Повертає рядок, що представляє передане значення типу long у восьмеричній системі числення.
        String octalString = Long.toOctalString(value1);
        System.out.println("toOctalString: " + octalString);

        // toString(long value): Повертає рядок, що представляє передане значення типу long у десятковій системі числення.
        String stringValue = Long.toString(value1);
        System.out.println("toString: " + stringValue);

        // toString(long value, int radix): Повертає рядок, що представляє передане значення типу long у вказаній системі числення.
        String stringValueWithRadix = Long.toString(value1, radix);
        System.out.println("toString (with radix): " + stringValueWithRadix);

        // toUnsignedString(long value): Повертає рядок, що представляє передане значення типу long як беззнакове ціле число у десятковій системі числення.
        String unsignedStringValue = Long.toUnsignedString(value1);
        System.out.println("toUnsignedString: " + unsignedStringValue);

        // toUnsignedString(long value, int radix): Повертає рядок, що представляє передане значення типу long як беззнакове ціле число у вказаній системі числення.
        String unsignedStringValueWithRadix = Long.toUnsignedString(value1, radix);
        System.out.println("toUnsignedString (with radix): " + unsignedStringValueWithRadix);

        // valueOf(long value): Повертає об'єкт типу Long, що містить передане значення типу long.
        Long longObject = Long.valueOf(value1);
        System.out.println("valueOf: " + longObject);

        // valueOf(String s): Повертає об'єкт типу Long, який представляється значенням, зчитаним з переданого рядка.
        Long parsedLongObject = Long.valueOf(strValue);
        System.out.println("valueOf (from string): " + parsedLongObject);

        // valueOf(String s, int radix): Повертає об'єкт типу Long, який представляється значенням, зчитаним з переданого рядка у вказаній системі числення.
        Long parsedLongObjectWithRadix = Long.valueOf(strValue, radix);
        System.out.println("valueOf (from string with radix): " + parsedLongObjectWithRadix);
    }
}
