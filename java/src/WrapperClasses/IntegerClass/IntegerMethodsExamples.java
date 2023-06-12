package WrapperClasses.IntegerClass;

public class IntegerMethodsExamples {

        public static void main(String[] args) {
            // Метод bitCount(int i) - Підраховує кількість встановлених бітів в двійковому представленні цілого числа i
            int count = Integer.bitCount(10); // 10 в двійковій системі: 1010, кількість встановлених бітів: 2
            System.out.println("Кількість встановлених бітів: " + count);

            // Метод byteValue() - Повертає ціле число у вигляді байта
            byte byteValue = Integer.valueOf(100).byteValue();
            System.out.println("Ціле число у вигляді байта: " + byteValue);

            // Метод compare(int x, int y) - Порівнює два цілих числа x і y
            int result = Integer.compare(5, 10); // Результат: -1 (5 < 10)
            System.out.println("Результат порівняння: " + result);

            // Метод compareTo(Integer anotherInteger) - Порівнює ціле число з іншим Integer об'єктом
            Integer num1 = 15;
            Integer num2 = 20;
            int comparisonResult = num1.compareTo(num2); // Результат: -1 (15 < 20)
            System.out.println("Результат порівняння: " + comparisonResult);

            // Метод compareUnsigned(int x, int y) - Порівнює два беззнакових цілих числа x і y
            int unsignedResult = Integer.compareUnsigned(-10, 20); // Результат: 1 (-10 < 20 в беззнаковому представленні)
            System.out.println("Результат беззнакового порівняння: " + unsignedResult);

            // Метод decode(String s) - Перетворює рядок s на ціле число
            int decodedValue = Integer.decode("0x10"); // Перетворення шістнадцяткового числа 0x10 у десяткову систему: 16
            System.out.println("Розкодоване значення: " + decodedValue);

            // Метод divideUnsigned(int dividend, int divisor) - Виконує беззнакове цілочисельне ділення dividend на divisor
            int divisionResult = Integer.divideUnsigned(25, 5); // Результат: 5 (25 / 5)
            System.out.println("Результат беззнакового ділення: " + divisionResult);

            // Метод doubleValue() - Перетворює ціле число у вигляді Integer на значення типу double
            double doubleValue = Integer.valueOf(50).doubleValue();
            System.out.println("Ціле число у вигляд і double: " + doubleValue);

            // Метод equals(Object obj) - Перевіряє, чи рівне ціле число іншому об'єкту
            boolean isEqual = Integer.valueOf(10).equals(Integer.valueOf(10));
            System.out.println("Чи рівні числа: " + isEqual);

            // Метод floatValue() - Перетворює ціле число у вигляді Integer на значення типу float
            float floatValue = Integer.valueOf(100).floatValue();
            System.out.println("Ціле число у вигляді float: " + floatValue);

            // Метод getInteger(String nm) - Отримує системну властивість з іменем nm як ціле число
            String propertyValue = System.getProperty("java.version"); // Отримання значення системної властивості
            Integer integerValue1 = Integer.getInteger("java.version");
            System.out.println("Значення системної властивості: " + integerValue1);

            // Метод hashCode() - Повертає хеш-код цілого числа
            int hashCode = Integer.valueOf(123).hashCode();
            System.out.println("Хеш-код числа: " + hashCode);

            // Метод highestOneBit(int i) - Повертає значення найбільшого встановленого біту в двійковому представленні цілого числа i
            int highestBit = Integer.highestOneBit(18); // 18 в двійковій системі: 10010, найбільший встановлений біт: 16
            System.out.println("Найбільший встановлений біт: " + highestBit);

            // Метод intValue() - Повертає ціле число у вигляді int
            int intValue = Integer.valueOf(50).intValue();
            System.out.println("Ціле число у вигляді int: " + intValue);

            // Метод longValue() - Повертає ціле число у вигляді long
            long longValue = Integer.valueOf(100).longValue();
            System.out.println("Ціле число у вигляді long: " + longValue);

            // Метод lowestOneBit(int i) - Повертає значення найменшого встановленого біту в двійковому представленні цілого числа i
            int lowestBit = Integer.lowestOneBit(18); // 18 в двійковій системі: 10010, найменший встановлений біт: 2
            System.out.println("Найменший встановлений біт: " + lowestBit);

            // Метод max(int a, int b) - Повертає більше з двох цілих чисел a і b
            int maxValue = Integer.max(10, 20); // Результат: 20
            System.out.println("Більше число: " + maxValue);

            // Метод min(int a, int b) - Повертає менше з двох цілих чисел a і b
            int minValue = Integer.min(10, 20); // Результат: 10
            System.out.println("Менше число: " + minValue);

            // Метод numberOfLeadingZeros(int i) - Повертає кількість нулів, що передують найбільшому встановленому біту в двійковому представленні цілого числа i
            int leadingZeros = Integer.numberOfLeadingZeros(10); // 10 в двійковій системі: 1010, кількість нулів: 28
            System.out.println("Кількість нулів перед найбільшим встановленим бітом: " + leadingZeros);

            // Метод parseInt(String s) - Перетворює рядок s на ціле число
            int parsedValue = Integer.parseInt("100"); // Перетворення рядка "100" у ціле число: 100
            System.out.println("Перетворене значення: " + parsedValue);

            // Метод parseUnsignedInt(String s) - Перетворює рядок s на беззнакове ціле число
            int unsignedParsedValue = Integer.parseUnsignedInt("FF", 16); // Перетворення шістнадцяткового рядка "FF" у беззнакове ціле число: 255
            System.out.println("Перетворене беззнакове значення: " + unsignedParsedValue);

            // Метод remainderUnsigned(int dividend, int divisor) - Обчислює залишок від беззнакового цілочисельного ділення dividend на divisor
            int remainder = Integer.remainderUnsigned(25, 7); // Результат: 4 (25 % 7)
            System.out.println("Залишок беззнакового ділення: " + remainder);

            // Метод reverse(int i) - Перевертає біти у двійковому представленні цілого числа i
            int reversedValue = Integer.reverse(10); // 10 в двійковій системі: 00000000000000000000000000001010, перевернуте значення: 10100000000000000000000000000000
            System.out.println("Перевернуте значення: " + reversedValue);

            // Метод reverseBytes(int i) - Перевертає байти у двійковому представленні цілого числа i
            int reversedBytes = Integer.reverseBytes(10); // 10 в двійковій системі: 00000000000000000000000000001010, перевернуті байти: 00001010000000000000000000000000
            System.out.println("Перевернуті байти: " + reversedBytes);

            // Метод rotateLeft(int i, int distance) - Виконує лівий циклічний зсув бітів у двійковому представленні цілого числа i на вказану відстань distance
            int rotatedLeft = Integer.rotateLeft(10, 2); // 10 в двійковій системі: 00000000000000000000000000001010, лівий зсув на 2 позиції: 00000000000000000000000000101000
            System.out.println("Лівий циклічний зсув: " + rotatedLeft);

            // Метод rotateRight(int i, int distance) - Виконує правий циклічний зсув бітів у двійковому представленні цілого числа i на вказану відстань distance
            int rotatedRight = Integer.rotateRight(10, 2); // 10 в двійковій системі: 00000000000000000000000000001010, правий зсув на 2 позиції: 10000000000000000000000000000010
            System.out.println("Правий циклічний зсув: " + rotatedRight);

            // Метод shortValue() - Перетворює ціле число у вигляді Integer на значення типу short
            short shortValue = Integer.valueOf(100).shortValue();
            System.out.println("Ціле число у вигляді short: " + shortValue);

            // Метод signum(int i) - Визначає знак цілого числа i і повертає -1, 0 або 1 в залежності від знаку числа
            int sign = Integer.signum(-10); // Результат: -1 (від'ємне число)
            System.out.println("Знак числа: " + sign);

            // Метод sum(int a, int b) - Обчислює суму двох цілих чисел a і b
            int sum = Integer.sum(10, 20); // Результат: 30
            System.out.println("Сума чисел: " + sum);

            // Метод toBinaryString(int i) - Перетворює ціле число i на рядок, що представляє його двійкове значення
            String binaryString = Integer.toBinaryString(10); // Двійкове представлення числа 10: 1010
            System.out.println("Двійкове представлення числа: " + binaryString);

            // Метод toHexString(int i) - Перетворює ціле число i на рядок, що представляє його шістнадцяткове значення
            String hexString = Integer.toHexString(255); // Шістнадцяткове представлення числа 255: FF
            System.out.println("Шістнадцяткове представлення числа: " + hexString);

            // Метод toOctalString(int i) - Перетворює ціле число i на рядок, що представляє його вісімкове значення
            String octalString = Integer.toOctalString(10); // Вісімкове представлення числа 10: 12
            System.out.println("Вісімкове представлення числа: " + octalString);

            // Метод toString(int i) - Перетворює ціле число i на рядок
            String stringValue = Integer.toString(100); // Число 100 у вигляді рядка: "100"
            System.out.println("Рядкове представлення числа: " + stringValue);

            // Метод toUnsignedLong(int x) - Перетворює беззнакове ціле число x на значення типу long
            long unsignedLong = Integer.toUnsignedLong(-1); // Беззнакове представлення числа -1: 4294967295
            System.out.println("Беззнакове представлення числа типу long: " + unsignedLong);

            // Метод toUnsignedString(int i) - Перетворює беззнакове ціле число i на рядок
            String unsignedString = Integer.toUnsignedString(-1); // Беззнакове представлення числа -1 у вигляді рядка: "4294967295"
            System.out.println("Беззнакове рядкове представлення числа: " + unsignedString);

            // Метод valueOf(int i) - Повертає Integer об'єкт, який містить ціле число i
            Integer integerValue2 = Integer.valueOf(100);
            System.out.println("Integer об'єкт: " + integerValue2);
        }
    }
