package ObjectOrientedProgramming.ObjectClassMethods.EqualsHashCode;

import java.util.Objects;

public class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        // Перевірка на тотожність об'єктів
        if (this == obj) {
            return true;
        }

        // Перевірка на null та клас об'єкту
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Переведення obj до типу Player
        Player other = (Player) obj;

        // Порівняння значень полів name та score
        return name.equals(other.name) && score == other.score;
    }

    @Override
    public int hashCode() {
        // Обчислення хеш-коду на основі полів name та score
        return Objects.hash(name, score);
    }
}