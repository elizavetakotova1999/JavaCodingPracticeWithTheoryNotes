package ObjectOrientedProgramming.ObjectClassMethods.Wait.Processor;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Створення черги
        Queue<String> queue = new LinkedList<>();

        // Додавання елементів до черги
        queue.offer("Елемент 1");
        queue.offer("Елемент 2");
        queue.offer("Елемент 3");

        // Створення екземпляра QueueProcessor з чергою
        QueueProcessor queueProcessor = new QueueProcessor(queue);

        // Створення та запуск потоку обробки черги
        Thread processingThread = new Thread(queueProcessor);
        processingThread.start();

        // Чекаємо, доки потік обробки завершить свою роботу
        try {
            processingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Головний потік завершено.");
    }
}
