package ObjectOrientedProgramming.ObjectClassMethods.Wait.Processor;

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
}

