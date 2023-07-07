package Strings.StringClass;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello, World!";

        //charAt() - Повертає символ рядка за заданим індексом:
        char ch = str3.charAt(7);
        System.out.println("1) charAt(): "+ ch); // Виведе: W

        //codePointAt() - Повертає кодову точку рядка за заданим індексом:
        int codePoint = str3.codePointAt(0);
        System.out.println("2) codePointAt(): "+codePoint); // Виведе: 72

        //codePointBefore(int index) - Повертає кодову точку рядка перед заданим індексом:
        int codePointBefore = str3.codePointBefore(7);
        System.out.println("3) codePointBefore(): "+codePointBefore); // Виведе: 32 (код пробілу)

        //codePointCount() - Повертає кількість кодових точок у заданому діапазоні індексів:
        int codePointCount = str3.codePointCount(0, 7);
        System.out.println("4) codePointCount(): "+codePointCount); // Виведе: 7

        //compareTo(String anotherString) - Порівнює лексикографічний порядок двох рядків:
        String apple = "apple";
        String banana = "banana";
        int result = apple.compareTo(banana);
        System.out.println("5) compareTo(): "+result); // Виведе: від'ємне число (-1)

        //compareToIgnoreCase(String str) - Порівнює лексикографічний порядок двох рядків, ігноруючи регістр:
        int result2 = apple.compareToIgnoreCase(banana);
        System.out.println("6) compareToIgnoreCase(): "+result2); // Виведе: додатнє число (1)

        //concat(String str) - Об'єднує рядок з іншим рядком:
        String concatenated = str1.concat(str2);
        System.out.println("7) concat(): "+concatenated); // Виведе: HelloWorld!

        //contains() - Перевіряє, чи містить рядок задану послідовність символів:
        boolean containsHello = str3.contains("Hello");
        System.out.println("8) contains(): "+containsHello); // Виведе: true

        //contentEquals(CharSequence cs) - Перевіряє, чи містить рядок те ж саме вміст,
        // що і задана послідовність символів (CharSequence):
        boolean contentEquals = str3.contentEquals(new StringBuilder("Hello, World!"));
        System.out.println("9) contentEquals(): "+contentEquals); // Виведе: true

        //copyValueOf(char[] data) - Створює новий рядок на основі заданого масиву символів:
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        String copyValueOf = String.copyValueOf(data);
        System.out.println("10) copyValueOf(): "+copyValueOf); // Виведе: Hello

        //endsWith() - Перевіряє, чи закінчується рядок заданим суфіксом:
        boolean endsWithWorld = str3.endsWith("World!");
        System.out.println("11) endsWith(): "+endsWithWorld); // Виведе: true

        //equals() - Перевіряє, чи рядок рівний іншому об'єкту:
        boolean isEqual = str1.equals(str2);
        System.out.println("12) equals(): "+isEqual); // Виведе: false

        //equalsIgnoreCase(String anotherString) - Порівнює два рядки, ігноруючи регістр символів:
        boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("13) equalsIgnoreCase(): "+equalsIgnoreCase); // Виведе: true

        //format(String format, Object... args) - Форматує рядок за заданим форматом та аргументами:
        String name = "Alice";
        int age = 25;
        String formatted = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println("14) format(): "+formatted); // Виведе: My name is Alice and I am 25 years old.

        //getBytes() - Повертає масив байтів, що представляє рядок, використовуючи кодування за замовчуванням:
        byte[] bytes = str3.getBytes();
        System.out.println("15) getBytes(): "+Arrays.toString(bytes)); // Виведе: [72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33]

        //hashCode() - Повертає хеш-код рядка:
        int hashCode = str1.hashCode();
        System.out.println("16) hashCode(): "+hashCode); // Виведе: 69609650

        //indexOf() - Знаходить індекс першого входження заданого символу у рядку:
        int index = str3.indexOf('o');
        System.out.println("17) indexOf(): "+index); // Виведе: 4

        //intern() - Повертає внутрішню репрезентацію рядка з пула літералів (String pool):
        String str4 = new String("Hello");
        String str5 = str4.intern();
        System.out.println("18) intern(): "+(str4 == str5)); // Виведе: false

        //isEmpty() - Перевіряє, чи є рядок порожнім:
        String empty = "";
        boolean isEmpty = empty.isEmpty();
        System.out.println("19) isEmpty():"+isEmpty); // Виведе: true

        //join(CharSequence delimiter, CharSequence... elements) - Об'єднує елементи рядка з вказаним роздільником:
        CharSequence[] elements = {"Hello", "World", "Java"};
        String joined = String.join(", ", elements);
        System.out.println("20) join(): "+joined); // Виведе: Hello, World, Java

        //lastIndexOf(int ch) - Знаходить індекс останнього входження заданого символу у рядок:
        int lastIndex = str3.lastIndexOf('o');
        System.out.println("21) lastIndexOf(): "+lastIndex); // Виведе: 8

        //length() - Повертає довжину рядка:
        int length = str3.length();
        System.out.println("22) length(): "+length); // Виведе: 13

        //matches(String regex) - Перевіряє, чи відповідає рядок заданому регулярному виразу:
        boolean matches = str3.matches("Hello.*");
        System.out.println("23) matches(): "+matches); // Виведе: true

        //offsetByCodePoints(int index, int codePointOffset) - Повертає індекс символу,
        // зміщений на задану кількість кодових точок:
        int offsetIndex = str3.offsetByCodePoints(0, 7);
        System.out.println("24) offsetByCodePoints(): "+offsetIndex); // Виведе: 7

        //regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len) - Порівнює підрядки
        // двох рядків в заданому діапазоні індексів:
        String ss = "hello, world!";
        boolean matchesRegion = str3.regionMatches(true, 0, ss, 0, 5);
        System.out.println("25) regionMatches(): "+matchesRegion); // Виведе: true

        //replace(char oldChar, char newChar) - Замінює всі входження заданого символу на інший символ у рядку:
        String replaced = str3.replace('o', 'a');
        System.out.println("26) replace(): "+replaced); // Виведе: Hella, Warld!

        //replaceAll(String regex, String replacement) - Замінює всі входження заданого регулярного
        // виразу на певний рядок:
        String replacedAll = str3.replaceAll("[oO]", "a");
        System.out.println("27) replaceAll(): "+replacedAll); // Виведе: Hella, Warld!

        //replaceFirst() - Замінює перше входження заданого регулярного виразу на певний рядок:
        String str7 = "Hello, Hello, World!";
        String replacedFirst = str7.replaceFirst("Hello", "Hi");
        System.out.println("28) replaceFirst():"+replacedFirst); // Виведе: Hi, Hello, World!

        // split() - Розбиває рядок на підрядки за допомогою роздільника (регулярний вираз):
        String[] parts = str3.split(", ");
        System.out.println("29) split(): ");
        for (String part : parts) {
            System.out.println(part);
        }

        //startsWith() - Перевіряє, чи починається рядок з заданої підстроки по вказаному індексу:
        boolean startsWithHello = str3.startsWith("Hello", 0);
        System.out.println("30) startsWith(): "+startsWithHello); // Виведе: true

        //subSequence(int beginIndex, int endIndex) - Повертає підрядок рядка в заданому діапазоні індексів:
        CharSequence subSequence = str3.subSequence(7, 12);
        System.out.println("31) subSequence(): "+subSequence); // Виведе: World

        //substring(int beginIndex, int endIndex) - Повертає підрядок рядка в заданому діапазоні індексів:
        String substring = str3.substring(7, 12);
        System.out.println("32) substring(): "+substring); // Виведе: World

        //toCharArray() - Перетворює рядок у масив символів:
        char[] charArray = str1.toCharArray();
        System.out.println("33) toCharArray(): "+Arrays.toString(charArray)); // Виведе: [H, e, l, l, o]

        //toLowerCase() - Перетворює всі символи рядка на малий регістр:
        String lowercase = str1.toLowerCase();
        System.out.println("34) toLowerCase(): "+lowercase); // Виведе: hello, world!

        //toUpperCase() - Перетворює всі символи рядка на великі літери:
        String uppercase = str3.toUpperCase();
        System.out.println("35) toUpperCase(): "+uppercase); // Виведе: HELLO, WORLD!

        //toString() - Перетворює об'єкт рядка на його рядкове представлення:
        String stringRepresentation = str3.toString();
        System.out.println("36) toString(): "+stringRepresentation); // Виведе: Hello, World!

        //trim() - Видаляє початкові та кінцеві пробіли з рядка:
        String trimmed = str.trim();
        System.out.println("37) trim(): "+trimmed); // Виведе: Hello, World!

        int number = 42;
        // valueOf() -Перетворює інший тип даних в рядок:
        String str6 = String.valueOf(number);
        System.out.println("38) valueOf(): "+ str6); // Виведе: 42


    }
}
