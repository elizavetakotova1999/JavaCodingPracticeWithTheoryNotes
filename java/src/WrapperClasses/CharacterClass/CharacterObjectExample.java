package WrapperClasses.CharacterClass;

public class CharacterObjectExample {
    private final char value;

    public CharacterObjectExample(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        CharacterObjectExample other = (CharacterObjectExample) obj;
        return this.value == other.value;
    }

    @Override
    public int hashCode() {
        return Character.hashCode(value);
    }

    public static void main(String[] args) {
        try {
            // Створення об'єкта CharacterExample зі значенням 'A'
            CharacterObjectExample ch1 = new CharacterObjectExample('A');
            System.out.println("ch1: " + ch1.getValue());

            // Створення об'єкта CharacterExample зі значенням 'B'
            CharacterObjectExample ch2 = new CharacterObjectExample('B');
            System.out.println("ch2: " + ch2.getValue());

            // Порівняння двох об'єктів CharacterExample за допомогою equals()
            boolean isEqual = ch1.equals(ch2);
            System.out.println("ch1 equals ch2: " + isEqual);

            // Обчислення хеш-коду об'єкта CharacterExample
            int hashCode = ch1.hashCode();
            System.out.println("ch1 hashCode: " + hashCode);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
