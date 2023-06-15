package ObjectOrientedProgramming.Encapsulation.Bank;

public class BankAccount {
    private final String accountNumber;  // Номер банківського рахунку
    private double balance;        // Баланс рахунку
    private final String customerName;   // Ім'я клієнта

    public BankAccount(String accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0.0;  // Початковий баланс рахунку
    }

    // Метод для покладання грошей на рахунок
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Поклали " + amount + " на рахунок.");
        } else {
            System.out.println("Сума повинна бути більше нуля.");
        }
    }

    // Метод для зняття грошей з рахунку
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Зняли " + amount + " з рахунку.");
            } else {
                System.out.println("Недостатньо коштів на рахунку.");
            }
        } else {
            System.out.println("Сума повинна бути більше нуля.");
        }
    }

    // Метод для отримання балансу рахунку
    public double getBalance() {
        return balance;
    }

    // Метод для отримання номеру рахунку
    public String getAccountNumber() {
        return accountNumber;
    }

    // Метод для отримання імені клієнта
    public String getCustomerName() {
        return customerName;
    }
}
