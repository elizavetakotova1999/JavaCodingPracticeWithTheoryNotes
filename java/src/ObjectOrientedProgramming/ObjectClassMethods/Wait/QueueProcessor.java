package ObjectOrientedProgramming.ObjectClassMethods.Wait;

import java.util.LinkedList;
import java.util.Queue;

public class QueueProcessor implements Runnable {
    private Queue<String> queue;

    public QueueProcessor(Queue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        synchronized (queue) {
            // Очікування, доки черга не стане доступною
            while (queue.isEmpty()) {
                try {
                    queue.wait(); // Потік залишається у режимі очікування
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Виконання роботи з чергою
            String data = queue.poll();
            System.out.println("Оброблено елемент: " + data);
        }
    }


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
