package WrapperClasses.DoubleClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleMethodsExampleTest {

    @Test
    void testDoubleValue() {
        Double num = 3.14;

        double doubleValue = num.doubleValue();

        Assertions.assertEquals(3.14, doubleValue);
    }

    @Test
    void testEquals() {
        Double num1 = 3.14;
        Double num2 = 3.14;
        Double num3 = 2.718;

        boolean equals1 = num1.equals(num2);
        boolean equals2 = num1.equals(num3);

        Assertions.assertTrue(equals1);
        Assertions.assertFalse(equals2);
    }

    @Test
    void testIsNaN() {
        Double nan = Double.NaN;
        Double num = 3.14;

        boolean isNaN1 = nan.isNaN();
        boolean isNaN2 = num.isNaN();

        Assertions.assertTrue(isNaN1);
        Assertions.assertFalse(isNaN2);
    }

    // Додайте тестові методи для інших методів класу Double

}