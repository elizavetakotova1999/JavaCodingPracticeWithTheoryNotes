package WrapperClasses.IntegerClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerMethodsExamplesTest {

    @Test
    public void testBitCount() {
        // Перевірка методу bitCount()
        int count = Integer.bitCount(10);
        Assertions.assertEquals(2, count);
    }

    @Test
    public void testByteValue() {
        // Перевірка методу byteValue()
        byte byteValue = Integer.valueOf(100).byteValue();
        Assertions.assertEquals(100, byteValue);
    }

    @Test
    public void testCompare() {
        // Перевірка методу compare()
        int result = Integer.compare(5, 10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testCompareTo() {
        Integer num1 = 15;
        Integer num2 = 20;
        int comparisonResult = num1.compareTo(num2);
        Assertions.assertEquals(-1, comparisonResult);
    }


}
