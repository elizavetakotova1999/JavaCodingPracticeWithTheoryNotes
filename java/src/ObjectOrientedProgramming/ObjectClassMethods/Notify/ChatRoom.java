package ObjectOrientedProgramming.ObjectClassMethods.Notify;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private List<String> messages;
    private boolean isMessageAvailable;

    public ChatRoom() {
        messages = new ArrayList<>();
        isMessageAvailable = false;
    }

    public synchronized void addMessage(String message) {
        messages.add(message);
        isMessageAvailable = true;
        notify(); // Сповіщення про наявність нового повідомлення
    }

    public synchronized String getMessage() {
        while (!isMessageAvailable) {
            try {
                wait(); // Очікування на нове повідомлення
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        String message = messages.remove(0);
        if (messages.isEmpty()) {
            isMessageAvailable = false;
        }
        return message;
    }
}

class User implements Runnable {
    private String name;
    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            String message = name + ": Message " + i;
            chatRoom.addMessage(message);
            System.out.println("Sent message: " + message);
            try {
                Thread.sleep(1000); // Затримка перед відправкою наступного повідомлення
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

 class RunMain {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        // Створення та запуск потоків користувачів
        Thread user1Thread = new Thread(new User("User 1", chatRoom));
        Thread user2Thread = new Thread(new User("User 2", chatRoom));

        user1Thread.start();
        user2Thread.start();

        // Очікування завершення потоків користувачів
        try {
            user1Thread.join();
            user2Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Отримання повідомлень зі спільної кімнати чату
        System.out.println("\nChat Room Messages:");
        while (true) {
            String message = chatRoom.getMessage();
            System.out.println("Received message: " + message);
            if (message.equals("User 1: Message 5")) {
                break; // Завершення отримання повідомлень після останнього повідомлення користувача 1
            }
        }
    }
}
