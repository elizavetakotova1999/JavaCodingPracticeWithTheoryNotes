package ObjectOrientedProgramming.ObjectClassMethods.EqualsHashCode;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("John", 100);
        Player player2 = new Player("Jane", 150);
        Player player3 = new Player("John", 100);

        // Порівняння об'єктів Player
        boolean areEqual = player1.equals(player2);
        System.out.println("Чи рівні player1 і player2? - " + areEqual); // Виведе: Are player1 and player2 equal? false

        areEqual = player1.equals(player3);
        System.out.println("Чи рівні player1 і player3? - " + areEqual); // Виведе: Are player1 and player3 equal? true

        // Використання об'єктів Player у хеш-контейнері
        Set<Player> playerSet = new HashSet<>();
        playerSet.add(player1);
        playerSet.add(player2);
        playerSet.add(player3);

        System.out.println("Size of playerSet: " + playerSet.size()); // Виведе: Size of playerSet: 2,
        // оскільки player1 та player3 вважаються однаковими об'єктами

        // Виведення даних гравців
        for (Player player : playerSet) {
            System.out.println("Name: " + player.getName() + ", Score: " + player.getScore());
        }
    }
}
