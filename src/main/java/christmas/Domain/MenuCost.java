package christmas.Domain;

public enum MenuCost {
    // 애피타이저
    SOUP("애피타이저", "양송이수프", 6000),
    TAPAS("애피타이저", "타파스", 5500),
    SALAD("애피타이저", "시저샐러드", 8000),

    // 메인
    TSTAKE("메인", "티본스테이크", 55000),
    LIPS("메인", "바비큐립", 54000),
    SEA_PASTA("메인", "해산물파스타", 35000),
    CHRISTMAS_PASTA("메인", "크리스마스파스타", 25000),

    // 디저트
    CHOCOCAKE("디저트", "초코케이크", 15000),
    ICECREAM("디저트", "아이스크림", 5000),

    // 음료
    ZEROCOKE("음료", "제로콜라", 3000),
    WINE("음료", "레드와인", 60000),
    CHAMPAGNE("음료", "샴페인", 25000);


    private final String type;
    private final String name;
    private final int price;

    MenuCost(String type, String name, int price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }


}
