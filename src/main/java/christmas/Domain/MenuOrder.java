package christmas.Domain;

import java.util.HashMap;
import java.util.Map;

public class MenuOrder {
    private final Map<String, Integer> orderItems;

    public MenuOrder(Map<String, Integer> orderItems) {
        this.orderItems = orderItems;
    }

    public static MenuOrder menuNum(String input) {
        Map<String, Integer> orderItems = new HashMap<>();

        String[] items = input.split(",");
        for (String item : items) {
            String[] parts = item.trim().split("-");

            if (parts.length != 2) {
                throw new IllegalArgumentException("유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }

            String menu = parts[0].trim();
            int quantity = Integer.parseInt(parts[1].trim());

            orderItems.put(menu, quantity);
        }


        return new MenuOrder(orderItems);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : orderItems.entrySet()) {
            result.append(entry.getKey()).append(" ").append(entry.getValue()).append("개\n");
        }
        return result.toString();
    }

    public Map<String, Integer> getOrderItems() {
        return orderItems;
    }
}
