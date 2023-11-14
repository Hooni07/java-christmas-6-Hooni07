package christmas.Domain;

public enum EventConstants {
    INITIAL_DISCOUNT(1000),
    MAX_DISCOUNT_DAY(25),
    WEEKDAY_DISCOUNT_AMOUNT(2023),
    WEEKEND_DISCOUNT_AMOUNT(2023),
    SPECIAL_DISCOUNT_AMOUNT(1000),
    MIN_TOTAL_ORDER_AMOUNT_FOR_GIFT(120000);

    private final int value;

    EventConstants(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}