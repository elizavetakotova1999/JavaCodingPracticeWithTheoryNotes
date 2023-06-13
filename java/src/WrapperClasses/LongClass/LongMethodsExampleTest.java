package WrapperClasses.LongClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongMethodsExampleTest {

    /**
     * Тестує метод decode() класу Long.
     * Перевіряє, чи правильно парситься рядок у відповідне значення типу long з урахуванням префіксів.
     */
    @Test
    public void testDecode() {
        String binaryString = "0b1010"; // Binary prefix '0b'
        String octalString = "0123"; // Octal prefix '0'
        String hexString = "0xABC"; // Hexadecimal prefix '0x'
        String decimalString = "12345"; // No prefix

        long expectedBinaryValue = 10L;
        long expectedOctalValue = 83L;
        long expectedHexValue = 2748L;
        long expectedDecimalValue = 12345L;

       // long decodedBinaryValue = Long.decode(binaryString);
        long decodedOctalValue = Long.decode(octalString);
        long decodedHexValue = Long.decode(hexString);
        long decodedDecimalValue = Long.decode(decimalString);

       // Assertions.assertEquals(expectedBinaryValue, decodedBinaryValue);
        Assertions.assertEquals(expectedOctalValue, decodedOctalValue);
        Assertions.assertEquals(expectedHexValue, decodedHexValue);
        Assertions.assertEquals(expectedDecimalValue, decodedDecimalValue);
    }

    /**
     * Тестує метод rotateLeft() класу Long.
     * Перевіряє, чи правильно виконується циклічний зсув вліво над переданим значенням типу long.
     */
    @Test
    public void testRotateLeft() {
        long value = 10L;
        int distance = 2;
        long expectedRotatedValue = 40L;

        long rotatedValue = Long.rotateLeft(value, distance);
        Assertions.assertEquals(expectedRotatedValue, rotatedValue);
    }

    /**
     * Тестує метод reverseBytes() класу Long.
     * Перевіряє, чи правильно перевертаються байти в переданому значенні типу long.
     */
    @Test
    public void testReverseBytes() {
        long value = 10L;
        long expectedReversedBytesValue = 720575940379279360L;

        long reversedBytesValue = Long.reverseBytes(value);
        Assertions.assertEquals(expectedReversedBytesValue, reversedBytesValue);
    }

    /**
     * Тестує метод parseLong() класу Long з некоректним вхідним рядком.
     * Перевіряє, чи видає виняток NumberFormatException при некоректному рядку.
     */
    @Test
    public void testParseLongWithInvalidString() {
        String invalidString = "abc";

        Assertions.assertThrows(NumberFormatException.class, () -> {
            Long.parseLong(invalidString);
        });
    }



            /**
             * Тестує метод signum() класу Long.
             * Перевіряє, чи правильно повертається знак переданого значення типу long.
             */
            @Test
            public void testSignum() {
                long positiveValue = 10L;
                long negativeValue = -10L;
                long zeroValue = 0L;

                int positiveSignum = Long.signum(positiveValue);
                int negativeSignum = Long.signum(negativeValue);
                int zeroSignum = Long.signum(zeroValue);

                Assertions.assertEquals(1, positiveSignum);
                Assertions.assertEquals(-1, negativeSignum);
                Assertions.assertEquals(0, zeroSignum);
            }

            /**
             * Тестує метод sum() класу Long.
             * Перевіряє, чи правильно обчислюється сума двох значень типу long.
             */
            @Test
            public void testSum() {
                long value1 = 10L;
                long value2 = 20L;
                long expectedSum = 30L;

                long sum = Long.sum(value1, value2);
                Assertions.assertEquals(expectedSum, sum);
            }



            /**
             * Тестує метод toBinaryString() класу Long.
             * Перевіряє, чи правильно перетворюється передане значення типу long в рядок у двійковій системі числення.
             */
            @Test
            public void testToBinaryString() {
                long value = 10L;
                String expectedBinaryString = "1010";

                String binaryString = Long.toBinaryString(value);
                Assertions.assertEquals(expectedBinaryString, binaryString);
            }

    /**
     * Тестує метод getLong() класу Long з використанням значення за замовчуванням.
     * Перевіряє, чи повертається значення системної властивості з вказаним ім'ям
     * як об'єкт типу Long, або задане значення за замовчуванням, якщо властивість не знайдена.
     */
    @Test
    public void testGetLongWithDefault() {
        String systemProperty = "nonexistent.property";
        long defaultValue = 10L;

        Long systemPropertyOrDefault = Long.getLong(systemProperty, defaultValue);
        Assertions.assertEquals(defaultValue, systemPropertyOrDefault);
    }




}



