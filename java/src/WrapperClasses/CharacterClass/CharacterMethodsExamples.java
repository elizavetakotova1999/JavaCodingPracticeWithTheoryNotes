package WrapperClasses.CharacterClass;

import java.util.Arrays;

public class CharacterMethodsExamples {
    public static void main(String[] args) {
        char ch = 'A';
        char ch1 = 'X';
        char ch2 = '3';
        char ch3 = '好';
        char ch4 = '$';
        char ch5 = '\n';
        char ch6 = 'i';
        char ch7 = '(';
        char ch8 = 'F';

        // Використання методу valueOf з цифровим значенням
        int num = 65;
        Character charObject = Character.valueOf((char) num);
        System.out.println("Об'єкт Character: " + charObject);

        // Перевірка, чи є символ цифрою
        boolean isDigit = Character.isDigit(ch);
        System.out.println("Є цифрою: " + isDigit);

        // Метод reverseBytes - зміна порядку байтів символу
        char originalChar = 'A';
        char reversedChar = Character.reverseBytes(originalChar);
        System.out.println("Символ: " + originalChar);
        System.out.println("Символ зі зміненим порядком байтів: " + reversedChar);

        // Перетворення символу на його числове значення (код Unicode)
        int numericValue = Character.getNumericValue(ch);
        System.out.println("Числове значення (код Unicode): " + numericValue);

        // Метод isDefined - перевіряє, чи символ визначений в стандарті Unicode
        boolean isDefined1 = Character.isDefined(ch1);
        boolean isDefined2 = Character.isDefined(ch2);
        System.out.println(ch1 + " визначений символ: " + isDefined1);
        System.out.println(ch2 + " визначений символ: " + isDefined2);

        // Метод charCount - отримання кількості UTF-16 кодів, які складають символ
        char unicodeChar = '\u2764'; // Символ серця (❤)
        int charCount = Character.charCount(unicodeChar);
        System.out.println("Символ: " + unicodeChar);
        System.out.println("Кількість UTF-16 кодів: " + charCount);

        // Метод toChars - конвертація символу в масив UTF-16 кодів
        char toChars = 'A';
        char[] charArray = Character.toChars(toChars);
        System.out.println("Символ: " + originalChar);
        System.out.println("Масив UTF-16 кодів: " + Arrays.toString(charArray));

        // Метод isISOControl - перевіряє, чи символ є символом ISO Control
        boolean isISOControl1 = Character.isISOControl(ch5);
        boolean isISOControl2 = Character.isISOControl(ch6);
        System.out.println(ch5 + " є символом ISO Control: " + isISOControl1);
        System.out.println(ch6 + " є символом ISO Control: " + isISOControl2);

        // Генерація випадкового символу
        char randomChar = Character.forDigit((int) (Math.random() * 10), 10);
        System.out.println("Випадковий симвод: " + randomChar);

        // Метод digit - отримання числового значення символу
        int numericValueDigit = Character.digit(ch, 10);
        System.out.println("Числове значення символу " + ch + ": " + numericValueDigit);

        // Перевірка, чи є символ літерою
        boolean isLetter = Character.isLetter(ch);
        System.out.println("Є літерою: " + isLetter);

        // Перевірка, чи є символи літерами або цифрами
        boolean isLetterOrDigit1 = Character.isLetterOrDigit(ch1);
        boolean isLetterOrDigit2 = Character.isLetterOrDigit(ch2);
        System.out.println("ch1 є літерою чи цифрою: " + isLetterOrDigit1);
        System.out.println("ch2 є літерою чи цифрою: " + isLetterOrDigit2);

        // Порівняння символів за їх відносним порядком
        int compareResult = Character.compare(ch1, ch2);
        System.out.println("Результат порівняння: " + compareResult);

        // Перевіряє, чи символ є буквою в мові Java
        boolean isJavaLetter1 = Character.isJavaLetter(ch1);
        boolean isJavaLetter2 = Character.isJavaLetter(ch2);
        System.out.println(ch1 + " є буквою в мові Java: " + isJavaLetter1);
        System.out.println(ch2 + " є буквою в мові Java: " + isJavaLetter2);

        // Перевіряє, чи символ є буквою або цифрою в мові Java
        boolean isJavaLetterOrDigit1 = Character.isJavaLetterOrDigit(ch1);
        boolean isJavaLetterOrDigit2 = Character.isJavaLetterOrDigit(ch2);
        System.out.println(ch1 + " є буквою або цифрою в мові Java: " + isJavaLetterOrDigit1);
        System.out.println(ch2 + " є буквою або цифрою в мові Java: " + isJavaLetterOrDigit2);

        //Отримує напрямок символу
        byte directionality = Character.getDirectionality(ch3);
        System.out.println("Напрямок символу " + ch3 + ": " + directionality);

        // Отримує тип символу
        int type1 = Character.getType(ch1);
        int type2 = Character.getType(ch2);
        System.out.println("Тип символу " + ch1 + ": " + type1);
        System.out.println("Тип символу " + ch2 + ": " + type2);

        // Метод isAlphabetic - перевіряє, чи символ є літерою
        boolean isAlphabetic1 = Character.isAlphabetic(ch1);
        boolean isAlphabetic2 = Character.isAlphabetic(ch2);
        System.out.println(ch1 + " є літерою: " + isAlphabetic1);
        System.out.println(ch2 + " є літерою: " + isAlphabetic2);


        // Метод isIdeographic - перевіряє, чи символ є ідеографічним символом (логограмою)
        boolean isIdeographic1 = Character.isIdeographic(ch3);
        boolean isIdeographic2 = Character.isIdeographic(ch4);
        System.out.println(ch3 + " є ідеографічним символом: " + isIdeographic1);
        System.out.println(ch4 + " є ідеографічним символом: " + isIdeographic2);


        // Метод isMirrored - перевіряє, чи символ має дзеркальний варіант
        boolean isMirrored1 = Character.isMirrored(ch7);
        boolean isMirrored2 = Character.isMirrored(ch8);
        System.out.println(ch7 + " має дзеркальний варіант: " + isMirrored1);
        System.out.println(ch8 + " має дзеркальний варіант: " + isMirrored2);

        //ПРОБІЛ
        // Перевірка, чи є символ пробільним символом
        boolean isWhitespace = Character.isWhitespace(ch);
        System.out.println("є пробільним символом:" + isWhitespace);
        // Перевірка, чи символ є пробілом
        boolean isSpaceChar = Character.isSpaceChar(ch);
        System.out.println(ch1 + "є пробілом: " + isSpaceChar);

        //РЕГІСТРИ
        // Перетворення символу на нижній регістр
        char lowerCaseCh = Character.toLowerCase(ch);
        System.out.println("Нижній регістр: " + lowerCaseCh);

        // Перетворення символу на верхній регістр
        char upperCaseCh = Character.toUpperCase(ch);
        System.out.println("Верхній регістр: " + upperCaseCh);

        // Перевірка, чи символ є малою літерою
        boolean isLowerCase = Character.isLowerCase(ch);
        System.out.println(ch1 + " є малою літерою: " + isLowerCase);

        // Перевірка, чи символ є великою літерою
        boolean isUpperCase = Character.isUpperCase(ch);
        System.out.println(ch1 + " є великою літерою: " + isUpperCase);



        /*Метод Character.isBmpCodePoint використовується для перевірки,
         чи належить задана кодова точка (code point) до основної мультибайтової
         площини (BMP) Unicode.*/
        int codePoint1 = 65; // Кодова точка символу 'A'
        int codePoint2 = 128169; // Кодова точка символу '🌹'

        boolean isBmpCodePoint1 = Character.isBmpCodePoint(codePoint1);
        boolean isBmpCodePoint2 = Character.isBmpCodePoint(codePoint2);

        System.out.println("Кодова точка BMP 1: " + isBmpCodePoint1);
        System.out.println("Кодова точка BMP 2: " + isBmpCodePoint2);

        /* Метод Character.toTitleCase використовується для перетворення символу на символ
        з верхнім регістром (титульний регістр) згідно з правилами локалі.*/
        char titleCase = Character.toTitleCase(ch1);
        System.out.println("Титульний регістр 1: " + titleCase);

        // Перевірка, чи символ є символом з великою першою літерою (Title Case)
        boolean isTitleCase = Character.isTitleCase(ch1);
        System.out.println(ch1 + " є символом з великою першою літерою (Title Case): " + isTitleCase);


        //СУРОГАТНІ ЧАСТИНИ/ПАРИ
        ch1 = 'Ї';
        ch2 = 'я';
        // Визначення вищої сурогатної частини для символу
        char highSurrogate1 = Character.highSurrogate(ch1);
        System.out.println("Вища сурогатна частина для '" + ch1 + "': " + highSurrogate1);

        // Визначення нижньої сурогатної частини для символу
        char lowSurrogate2 = Character.lowSurrogate(ch2);
        System.out.println("Нижня сурогатна частина для '" + ch2 + "': " + lowSurrogate2);

        // Перевірка, чи є символ нижньою сурогатною частиною
        boolean isLowSurrogate1 = Character.isLowSurrogate(ch1);
        System.out.println("'" + ch1 + "' є нижньою сурогатною частиною: " + isLowSurrogate1);

        // Перевірка, чи є символ вищою сурогатною частиною
        boolean isHighSurrogate2 = Character.isHighSurrogate(ch2);
        System.out.println("'" + ch2 + "' є вищою сурогатною частиною: " + isHighSurrogate2);

        // Перевірка, чи є символ сурогатним
        boolean isSurrogate1 = Character.isSurrogate(ch1);
        System.out.println("'" + ch1 + "' є сурогатним: " + isSurrogate1);

        // Перевірка, чи є пара символів сурогатною парою
        boolean isSurrogatePair = Character.isSurrogatePair(highSurrogate1, lowSurrogate2);
        System.out.println("'" + highSurrogate1 + lowSurrogate2 + "' є сурогатною парою: " + isSurrogatePair);

        String str = "Привіт, світе!";
        int index = 4;
        char highSurrogate = '\uD83D';
        char lowSurrogate = '\uDE00';

        // Конвертація в сурогатну пару
        int codePoint = Character.toCodePoint(highSurrogate, lowSurrogate);
        System.out.println("Сурогатна пара: " + highSurrogate + lowSurrogate);
        System.out.println("Кодова точка: " + codePoint);

        //КОДОВІ ТОЧКИ
        // Отримання символу за заданою кодовою точкою
        char character = Character.toChars(codePoint)[0];
        System.out.println("Кодова точка: " + codePoint);
        System.out.println("Символ: " + character);

        // Отримання кодової точки символу за певним індексом
        int codePointAt = Character.codePointAt(str, index);
        System.out.println("Кодова точка на позиції " + index + ": " + codePointAt);

        // Отримання кодової точки для певного індексу в рядку
        int codePointAtIndex = Character.codePointAt(str, 7);
        System.out.println("Кодова точка на позиції 7: " + codePointAtIndex);

        // Отримання кодової точки перед певним індексом
        int codePointBefore = Character.codePointBefore(str, index);
        System.out.println("Кодова точка перед позицією " + index + ": " + codePointBefore);

        // Отримання кількості кодових точок у рядку
        int codePointCount = Character.codePointCount(str, 0, str.length());
        System.out.println("Кількість кодових точок у рядку: " + codePointCount);

        // Перевірка, чи є задана точка допустимою кодовою точкою
        boolean isValidCodePoint = Character.isValidCodePoint(codePoint);
        System.out.println("Кодова точка " + codePoint + " є допустимою: " + isValidCodePoint);

        // Перевірка, чи є задана точка сурогатною кодовою точкою
        boolean isSupplementaryCodePoint = Character.isSupplementaryCodePoint(codePoint);
        System.out.println("Кодова точка " + codePoint + " є сурогатною: " + isSupplementaryCodePoint);

        // Зміщення індексу на задану кількість кодових точок
        int offset = 2;
        int newIndex = Character.offsetByCodePoints(str, index, offset);
        System.out.println("Новий індекс після зміщення на " + offset + " кодових точок: " + newIndex);

        //ІДЕНТИФІКАТОРИ
        // Перевірка, чи символ є допустимою частиною ідентифікатора в Java
        boolean isJavaIdentifierPart= Character.isJavaIdentifierPart(ch1);
        System.out.println(ch1 + " є допустимою частиною ідентифікатора в Java: " + isJavaIdentifierPart);

        // Перевірка, чи символ може бути першим символом ідентифікатора в Java
        boolean isJavaIdentifierStart = Character.isJavaIdentifierStart(ch1);
        System.out.println(ch1 + " може бути першим символом ідентифікатора в Java: " + isJavaIdentifierStart);

        // Перевірка, чи символ є допустимою частиною Unicode ідентифікатора
        boolean isUnicodeIdentifierPart = Character.isUnicodeIdentifierPart(ch1);
        System.out.println(ch1 + " є допустимою частиною Unicode ідентифікатора: " + isUnicodeIdentifierPart);

        // Перевірка, чи символ може бути першим символом Unicode ідентифікатора
        boolean isUnicodeIdentifierStart = Character.isUnicodeIdentifierStart(ch1);
        System.out.println(ch1 + " може бути першим символом Unicode ідентифікатора: " + isUnicodeIdentifierStart);

        // Перевірка, чи символ є ігнорованим для ідентифікатора
        boolean isIdentifierIgnorable = Character.isIdentifierIgnorable(ch1);
        System.out.println(ch1 + " є ігнорованим символом для ідентифікатора: " + isIdentifierIgnorable);


    }
}
