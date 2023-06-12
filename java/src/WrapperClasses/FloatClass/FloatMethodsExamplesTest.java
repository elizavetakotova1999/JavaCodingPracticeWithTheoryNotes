package WrapperClasses.FloatClass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FloatMethodsExamplesTest {

    @Test
    void testIntBitsToFloat() {
        int intBits = 1065353216;
        float expectedFloatValue = 1.0f;

        float actualFloatValue = Float.intBitsToFloat(intBits);
        assertEquals(expectedFloatValue, actualFloatValue, 0.0f, "Float value does not match");
    }

    @Test
    void testHashCode() {
        float floatValue = 3.14f;
        int expectedHashCode = Float.valueOf(floatValue).hashCode();

        Float floatObj = Float.valueOf(floatValue);
        int actualHashCode = floatObj.hashCode();
        assertEquals(expectedHashCode, actualHashCode, "Hash codes do not match");
    }

    @Test
    void testCompare() {
        float value1 = 3.14f;
        float value2 = 2.5f;
        int expectedCompareResult = 1;

        int actualCompareResult = Float.compare(value1, value2);
        assertEquals(expectedCompareResult, actualCompareResult, "Compare results do not match");
    }
}