package WrapperClasses.CharacterClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CharacterMethodsExamplesTest {

    @Test
    void testIsDigit() {
        char ch = 'A';
        boolean isDigit = Character.isDigit(ch);
        Assertions.assertFalse(isDigit, "Символ не повинен бути цифрою");

        ch = '3';
        isDigit = Character.isDigit(ch);
        Assertions.assertTrue(isDigit, "Символ повинен бути цифрою");
    }

    @Test
    void testReverseBytes() {
        char originalChar = 'A';
        char reversedChar = Character.reverseBytes(originalChar);
        Assertions.assertNotEquals(originalChar, reversedChar, "Байти мають бути перевернуті");
    }

    @Test
    void testIsLetter() {
        char ch = '1';
        boolean isLetter = Character.isLetter(ch);
        Assertions.assertFalse(isLetter, "Символ не повинен бути літерою");

        ch = 'A';
        isLetter = Character.isLetter(ch);
        Assertions.assertTrue(isLetter, "Символ повинен бути літерою");
    }

    @Test
    void testIsWhitespace() {
        char ch = 'A';
        boolean isWhitespace = Character.isWhitespace(ch);
        Assertions.assertFalse(isWhitespace, "Символ не повинен бути пробілом");

        ch = ' ';
        isWhitespace = Character.isWhitespace(ch);
        Assertions.assertTrue(isWhitespace, "Символ повинен бути пробілом");
    }

    @Test
    void testToUpperCase() {
        char ch = 'a';
        char uppercaseChar = Character.toUpperCase(ch);
        Assertions.assertEquals('A', uppercaseChar, "Символ не був перетворений у верхній регістр");
    }

    @Test
    void testIsUpperCase() {
        char ch = 'a';
        boolean isUpperCase = Character.isUpperCase(ch);
        Assertions.assertFalse(isUpperCase, "Символ не повинен бути у верхньому регістрі");

        ch = 'A';
        isUpperCase = Character.isUpperCase(ch);
        Assertions.assertTrue(isUpperCase, "Символ повинен бути у верхньому регістрі");
    }



}