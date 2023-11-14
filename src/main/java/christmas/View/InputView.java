package christmas.View;

import camp.nextstep.edu.missionutils.Console;
import christmas.Domain.MenuOrder;

public class InputView {
    public int readDate() {
        System.out.println("12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)");
        String input = Console.readLine();
        int visitDate = Integer.parseInt(input);

        // 입력 값 검증
        if (visitDate < 1 || visitDate > 31) {
            throw new IllegalArgumentException("유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }

        return visitDate;
    }

    public MenuOrder readMenuOrder() {
        System.out.println("주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)");
        String input = Console.readLine();
        return MenuOrder.parse(input);
    }
}
