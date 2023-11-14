package christmas.Domain;

public class EventBadge {
    private final int totalBenefits;

    public EventBadge(int totalBenefits) {
        this.totalBenefits = totalBenefits;
    }

    public String getBadgeName() {
        if (totalBenefits >= 20000) {
            return "산타";
        } else if (totalBenefits >= 10000) {
            return "트리";
        } else if (totalBenefits >= 5000) {
            return "별";
        } else {
            return "없음";
        }
    }
}
