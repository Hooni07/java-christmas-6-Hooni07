package christmas.Domain;

import java.util.HashMap;
import java.util.Map;

public class MenuOrder {
    private final Map<String, Integer> orderItems;

    public MenuOrder(Map<String, Integer> orderItems) {
        this.orderItems = orderItems;
    }

    public static MenuOrder parse(String input) {
        Map<String, Integer> orderItems = new HashMap<>();

        // 입력을 쉼표(,)를 기준으로 나누고 각각의 아이템을 처리
        String[] items = input.split(",");
        for (String item : items) {
            String[] parts = item.trim().split("-");

            // 메뉴와 수량이 정확하게 나누어지는지 확인
            if (parts.length != 2) {
                throw new IllegalArgumentException("유효하지 않은 주문입니다. 다시 입력해 주세요.");
            }

            String menu = parts[0].trim();
            int quantity = Integer.parseInt(parts[1].trim());

            // 메뉴와 수량을 Map에 추가
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
