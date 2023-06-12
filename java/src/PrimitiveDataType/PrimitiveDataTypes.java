package PrimitiveDataType;

public class PrimitiveDataTypes {
    // Цілі числа
    static byte myByte = 10;
    static short myShort = 100;
    static int myInt = 1000;
    static long myLong = 100000L;

    // Числа з плавучою крапкою
    static float myFloat = 3.14f;
    static double myDouble = 3.14159;

    // Символ
    static char myChar = 'A';

    // Булеве значення
    static boolean myBoolean = true;

    // Арифметичні операції
    static int sum = myInt + myShort;
    static double product = myDouble * myFloat;
    static long difference = myLong - myByte;
    static float quotient = (float) myInt / myFloat; // Потрібно приведення типів

    // Конкатенація рядків
    static String result = "The sum is: " + sum;

    // Логічні операції
    static boolean logicalAnd = myBoolean && (myByte > 5);
    static boolean logicalOr = myBoolean || (myShort < 50);
    static boolean logicalNot = !myBoolean;

    public static void main(String[] args) {

            // Виведення результатів на консоль
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Difference: " + difference);
            System.out.println("Quotient: " + quotient);
            System.out.println("Result: " + result);
            System.out.println("Logical AND: " + logicalAnd);
            System.out.println("Logical OR: " + logicalOr);
            System.out.println("Logical NOT: " + logicalNot);

        }
    }
