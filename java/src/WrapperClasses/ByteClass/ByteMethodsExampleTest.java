package WrapperClasses.ByteClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ByteMethodsExampleTest {

    @Test
    public void testByteValue() {
        byte value = 10;
        byte byteValue = Byte.valueOf(value).byteValue();
        Assertions.assertEquals(value, byteValue);
    }

    @Test
    public void testCompareTo() {
        byte value1 = 10;
        byte value2 = 20;
        int compareResult = Byte.compare(value1, value2);
        Assertions.assertTrue(compareResult < 0);
    }

    @Test
    public void testDecode() {
        String strValue = "30";
        byte decodedValue = Byte.decode(strValue);
        Assertions.assertEquals(30, decodedValue);
    }

    @Test
    public void testToUnsignedLong() {
        byte value = -128;
        long unsignedLong = Byte.toUnsignedLong(value);
        Assertions.assertEquals(128, unsignedLong);
    }

}
