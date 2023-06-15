package ObjectOrientedProgramming;

// Абстрактний клас "Користувач"
abstract class User {
    protected String username;

    public User(String username) {
        this.username = username;
    }

    // Абстрактний метод, який буде реалізовано в підкласах
    public abstract void sendMessage(String message);

    // Загальний метод для всіх користувачів
    public void introduce() {
        System.out.println("Привіт, мене звати " + username);
    }
}

// Інтерфейс для адміністраторів
interface Admin {
    void sendWarning(String message);
}

// Підклас "Адміністратор", успадковує клас "Користувач" і реалізує інтерфейс "Admin"
class Administrator extends User implements Admin {
    private String adminCode;

    public Administrator(String username, String adminCode) {
        super(username);
        this.adminCode = adminCode;
    }

    // Реалізація методу з інтерфейсу "Admin"
    public void sendWarning(String message) {
        System.out.println("[Попередження] " + username + ": " + message);
    }

    // Реалізація абстрактного методу з батьківського класу "User"
    public void sendMessage(String message) {
        System.out.println(username + " відправив повідомлення: " + message);
    }
}

// Підклас "КористувачЧату", успадковує клас "Користувач"
class ChatUser extends User {
    private int unreadMessages;

    public ChatUser(String username) {
        super(username);
        this.unreadMessages = 0;
    }

    // Реалізація абстрактного методу з батьківського класу "User"
    public void sendMessage(String message) {
        System.out.println(username + " відправив повідомлення: " + message);
    }

    public void receiveMessage(String message) {
        System.out.println(username + " отримав повідомлення: " + message);
        unreadMessages++;
    }

    public void checkUnreadMessages() {
        System.out.println(username + " має " + unreadMessages + " непрочитаних повідомлень");
        unreadMessages = 0;
    }
}

// Головний клас
public class OopAllFeatures {
    public static void main(String[] args) {
        ChatUser user1 = new ChatUser("user1");
        ChatUser user2 = new ChatUser("user2");
        Administrator admin = new Administrator("admin", "1234");

        user1.sendMessage("Привіт усім!");
        user2.sendMessage("Привіт, user1!");

        admin.sendWarning("Зверніть увагу на правила чату!");

        user1.receiveMessage("Привіт, user1! Що нового?");
        user1.checkUnreadMessages();
        user2.checkUnreadMessages();

        admin.introduce();
        user1.introduce();
        user2.introduce();
    }
}
