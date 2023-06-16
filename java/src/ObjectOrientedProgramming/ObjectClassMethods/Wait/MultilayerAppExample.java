package ObjectOrientedProgramming.ObjectClassMethods.Wait;

public class MultilayerAppExample {
    private boolean isLayer1Ready = false;
    private boolean isLayer2Ready = false;

    public synchronized void processLayer1() {
        // Обробка першого рівня даних
        System.out.println("Processing Layer 1 started");

        // Симуляція обробки даних
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Встановлення прапорця, що перший рівень обробки завершено
        isLayer1Ready = true;

        // Сповіщення інших потоків про готовність першого рівня даних
        notifyAll();
    }

    public synchronized void processLayer2() {
        // Очікування, доки перший рівень обробки не буде завершено
        while (!isLayer1Ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Обробка другого рівня даних
        System.out.println("Processing Layer 2 started");

        // Симуляція обробки даних
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Встановлення прапорця, що другий рівень обробки завершено
        isLayer2Ready = true;

        // Сповіщення інших потоків про готовність другого рівня даних
        notifyAll();
    }

    public synchronized void processLayer3() {
        // Очікування, доки другий рівень обробки не буде завершено
        while (!isLayer2Ready) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Обробка третього рівня даних
        System.out.println("Processing Layer 3 started");

        // Симуляція обробки даних
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вивід повідомлення про завершення процесу
        System.out.println("Processing completed");
    }

    public static void main(String[] args) {
        MultilayerAppExample app = new MultilayerAppExample();

        Thread layer1Thread = new Thread(new Runnable() {
            @Override
            public void run() {
                app.processLayer1();
            }
        });

        Thread layer2Thread = new Thread(new Runnable() {
            @Override
            public void run() {
                app.processLayer2();
            }
        });

        Thread layer3Thread = new Thread(new Runnable() {
            @Override
            public void run() {
                app.processLayer3();
            }
        });

        layer3Thread.start();
        layer2Thread.start();
        layer1Thread.start();
    }
}

