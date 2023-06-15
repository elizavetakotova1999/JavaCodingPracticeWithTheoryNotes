package ObjectOrientedProgramming.ObjectClassMethods.ToString;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int orderId; // Ідентифікатор замовлення
    private Map<String, Integer> items; // Мапа для зберігання товарів і кількості

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new HashMap<>();
    }

    // Додати товар і кількість до замовлення
    public void addItem(String item, int quantity) {
        items.put(item, quantity);
    }

    // Метод equals

    // Метод hashCode

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Items:\n");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            sb.append("  - ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
