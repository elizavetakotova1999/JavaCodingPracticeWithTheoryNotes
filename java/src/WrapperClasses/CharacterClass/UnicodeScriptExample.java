package WrapperClasses.CharacterClass;

public class UnicodeScriptExample {
    public static void main(String[] args) {
        String text = "Привіт, 世界!"; // Текст, який містить символи з різних скриптів

        for (int i = 0; i < text.length(); i++) {
            int codePoint = text.codePointAt(i);
            Character.UnicodeScript unicodeScript = Character.UnicodeScript.of(codePoint);
            String scriptName = unicodeScript.toString();
            String character = new String(Character.toChars(codePoint));

            System.out.println("Character: " + character);
            System.out.println("Code Point: " + codePoint);
            System.out.println("Unicode Script: " + scriptName);
            System.out.println();
        }
    }
}
