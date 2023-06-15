package WrapperClasses.ShortClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShortMethodsExampleTest {

    @Test
    public void testByteValue() {
        Short number = Short.valueOf((short) 10);
        byte byteValue = number.byteValue();
        Assertions.assertEquals(10, byteValue);
    }

    @Test
    public void testCompare() {
        short x = 20;
        short y = 30;
        int compareResult = Short.compare(x, y);
        Assertions.assertTrue(compareResult < 0);
    }

    @Test
    public void testCompareTo() {
        Short number1 = Short.valueOf((short) 10);
        Short number2 = Short.valueOf((short) 15);
        int compareToResult = number1.compareTo(number2);
        Assertions.assertTrue(compareToResult < 0);
    }

    @Test
    public void testReverseBytes() {
        Short number = Short.valueOf((short) 10);
        short reversedBytes = Short.reverseBytes(number);
        Assertions.assertEquals(2560, reversedBytes);
    }

    @Test
    public void testShortValue() {
        Short number = Short.valueOf((short) 10);
        short shortValue = number.shortValue();
        Assertions.assertEquals(10, shortValue);
    }


}
