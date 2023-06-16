package ObjectOrientedProgramming.ObjectClassMethods.NotifyAll;

public class Event {
    private boolean isComplete = false;

    public synchronized void completeEvent() {
        isComplete = true;
        notifyAll(); // Сповіщення всіх потоків, що чекають на подію
    }

    public synchronized void waitForCompletion() throws InterruptedException {
        while (!isComplete) {
            wait(); // Потік залишається у режимі очікування, поки подія не буде завершена
        }
        System.out.println("Подія завершена.");
    }
}

class Participant implements Runnable {
    private Event event;

    public Participant(Event event) {
        this.event = event;
    }

    @Override
    public void run() {
        try {
            System.out.println("Учасник " + Thread.currentThread().getName() + " очікує на завершення події.");
            event.waitForCompletion();
            System.out.println("Учасник " + Thread.currentThread().getName() + " отримав повідомлення про завершення події.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class EventMain {
    public static void main(String[] args) {
        Event event = new Event();

        // Створення та запуск потоків-учасників
        Thread participant1 = new Thread(new Participant(event), "Учасник 1");
        Thread participant2 = new Thread(new Participant(event), "Учасник 2");
        Thread participant3 = new Thread(new Participant(event), "Учасник 3");

        participant1.start();
        participant2.start();
        participant3.start();

        // Певний час для підготовки події
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Завершення події та сповіщення всіх потоків
        event.completeEvent();
    }
}

