package christmas.Domain;

public class EventResult {
    private final int totalBenefits;
    private final int finalPayment;
    private final int totalOrderAmount;

    public EventResult(int totalBenefits, int finalPayment, int totalOrderAmount) {
        this.totalBenefits = totalBenefits;
        this.finalPayment = finalPayment;
        this.totalOrderAmount = totalOrderAmount;
    }

    public int getTotalBenefits() {
        return totalBenefits;
    }

    public int getFinalPayment() {
        return finalPayment;
    }

    public int getTotalOrderAmount() {
        return totalOrderAmount;
    }

    @Override
    public String toString() {
        return String.format("<총혜택 금액>: %,d원\n<할인 후 예상 결제 금액>: %,d원\n<할인 전 총주문 금액>: %,d원",
                totalBenefits, finalPayment, totalOrderAmount);
    }
}
