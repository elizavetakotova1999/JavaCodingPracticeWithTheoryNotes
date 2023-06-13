package WrapperClasses.BooleanClass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BooleanMethodsExampleTest {


    @Test
    void getBoolean() {
        // Перевірка методу getBoolean()
        // Повертає значення за замовчуванням (false), оскільки рядок недійсний
        boolean result = Boolean.getBoolean("invalid");
        assertFalse(result);
    }

    @Test
    void logicalAnd() {
        // Перевірка методу logicalAnd()
        // Повертає true, якщо обидва значення є true
        boolean result = Boolean.logicalAnd(true, true);
        assertTrue(result);
    }

    @Test
    void logicalOr() {
        // Перевірка методу logicalOr()
        // Повертає false, якщо обидва значення є false
        boolean result = Boolean.logicalOr(false, false);
        assertFalse(result);
    }

    @Test
    void logicalXor() {
        // Перевірка методу logicalXor()
        // Повертає true, якщо значення відрізняються (одне true, інше false)
        boolean result = Boolean.logicalXor(true, false);
        assertTrue(result);
    }



    @Test
    void parseBoolean() {
        // Перевірка методу parseBoolean()
        // Повертає значення за замовчуванням (false), оскільки рядок недійсний
        boolean result = Boolean.parseBoolean("invalid");
        assertFalse(result);
    }

    @Test
    void toStringWithTrueValue() {
        // Перевірка методу toString()
        // Повертає рядок "true" для значення true
        Boolean bool = Boolean.TRUE;
        String result = bool.toString();
        assertEquals("true", result);
    }

    @Test
    void valueOf() {
        // Перевірка методу valueOf()
        // Повертає об'єкт Boolean для рядка "true"
        Boolean result = Boolean.valueOf("true");
        assertTrue(result);
    }
}
