package christmas.Domain;

public class EventCalculator {

    private final MenuOrder menuOrder;

    public EventCalculator(MenuOrder menuOrder) {
        this.menuOrder = menuOrder;
    }

    public EventResult calculateEvent() {
        int totalBenefits = getTotalBenefits();
        int finalPayment = calculateFinalPayment();
        int totalOrderAmount = getTotalOrderAmount();

        return new EventResult(totalBenefits, finalPayment, totalOrderAmount);
    }



    public int getTotalBenefits() {
        // (총혜택 금액 계산 로직을 여기에 구현)
        return 0;
    }

    private int calculateFinalPayment() {
        // (할인 후 예상 결제 금액 계산 로직을 여기에 구현)
        return 0;
    }

    public int getTotalOrderAmount() {
        menuOrder.getOrderItems();
        return 0;
    }
}
