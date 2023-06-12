package PrimitiveDataType;

public class PrimitiveDataTypes {
        public static void main(String[] args) {
            // Цілі числа
            byte myByte = 10;
            short myShort = 100;
            int myInt = 1000;
            long myLong = 100000L;

            // Числа з плавучою крапкою
            float myFloat = 3.14f;
            double myDouble = 3.14159;

            // Символ
            char myChar = 'A';

            // Булеве значення
            boolean myBoolean = true;

            // Арифметичні операції
            int sum = myInt + myShort;
            double product = myDouble * myFloat;
            long difference = myLong - myByte;
            float quotient = myInt / myFloat;

            // Конкатенація рядків
            String result = "The sum is: " + sum;

            // Логічні операції
            boolean logicalAnd = myBoolean && (myByte > 5);
            boolean logicalOr = myBoolean || (myShort < 50);
            boolean logicalNot = !myBoolean;

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
