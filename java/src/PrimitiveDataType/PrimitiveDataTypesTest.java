package PrimitiveDataType;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrimitiveDataTypesTest {

    @Test
    public void testArithmeticOperations() {
        byte myByte = 10;
        short myShort = 100;
        int myInt = 1000;
        long myLong = 100000L;
        float myFloat = 3.14f;
        double myDouble = 3.14159;

        // Очікувані значення для арифметичних операцій
        int expectedSum = myInt + myShort;
        double expectedProduct = myDouble * myFloat;
        long expectedDifference = myLong - myByte;
        float expectedQuotient = (float) myInt / myFloat; // Потрібно приведення типів

        // Перевірка очікуваних результатів
        assertEquals(expectedSum, PrimitiveDataTypes.sum);
        assertEquals(expectedProduct, PrimitiveDataTypes.product);
        assertEquals(expectedDifference, PrimitiveDataTypes.difference);
        assertEquals(expectedQuotient, PrimitiveDataTypes.quotient);
    }

    @Test
    public void testConcatenation() {
        // Очікуваний результат для конкатенації рядків
        String expected = "The sum is: " + PrimitiveDataTypes.sum;

        // Перевірка очікуваного результату
        assertEquals(expected, PrimitiveDataTypes.result);
    }

    @Test
    public void testLogicalOperations() {
        // Очікувані значення для логічних операцій
        boolean expectedLogicalAnd = PrimitiveDataTypes.myBoolean && (PrimitiveDataTypes.myByte > 5);
        boolean expectedLogicalOr = PrimitiveDataTypes.myBoolean || (PrimitiveDataTypes.myShort < 50);
        boolean expectedLogicalNot = !PrimitiveDataTypes.myBoolean;

        // Перевірка очікуваних результатів
        assertEquals(expectedLogicalAnd, PrimitiveDataTypes.logicalAnd);
        assertEquals(expectedLogicalOr, PrimitiveDataTypes.logicalOr);
        assertEquals(expectedLogicalNot, PrimitiveDataTypes.logicalNot);
    }
}