package christmas.View;

import christmas.Domain.EventResult;
import christmas.Domain.MenuOrder;

public class OutputView {
    public void printOrderMenu(MenuOrder menuOrder) {
        System.out.println("<주문 메뉴>");
        System.out.println(menuOrder.toString());
    }

    public void printTotalOrderAmount(int totalOrderAmount) {
        System.out.println("\n<할인 전 총주문 금액>");
        System.out.println(totalOrderAmount + "원");
    }

    public void printGift(MenuOrder menuOrder, EventResult eventResult) {
        System.out.println("\n<증정 메뉴>");
        System.out.println(eventResult.getGiftMenu().orElse("없음"));
    }

    public void printBenefits(EventResult eventResult) {
        System.out.println("\n<혜택 내역>");
        for (String benefit : eventResult.getBenefits()) {
            System.out.println(benefit);
        }
    }

    public void printTotalBenefits(int totalBenefits) {
        System.out.println("\n<총혜택 금액>");
        System.out.println(totalBenefits + "원");
    }

    public void printFinalPayment(int finalPayment) {
        System.out.println("\n<할인 후 예상 결제 금액>");
        System.out.println(finalPayment + "원");
    }

    public void printEventBadge(int totalBenefits) {
        System.out.println("\n<12월 이벤트 배지>");
        System.out.println(EventBadge.getEventBadge(totalBenefits));
    }
}
