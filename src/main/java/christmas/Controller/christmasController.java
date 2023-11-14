package christmas.Controller;

import christmas.Domain.EventCalculator;
import christmas.Domain.EventResult;
import christmas.Domain.MenuOrder;
import christmas.View.InputView;
import christmas.View.OutputView;

public class christmasController {
    public static void main(String[] args) {
        InputView inputView = new InputView();


        int visitDate = inputView.readDate();


        MenuOrder menuOrder = inputView.readMenuOrder();


        EventCalculator calculator = new EventCalculator(menuOrder);
        EventResult eventResult = calculator.calculateEvent();


        OutputView outputView = new OutputView();


        outputView.printOrderMenu(menuOrder);
        outputView.printTotalOrderAmount(calculator.getTotalOrderAmount());
        outputView.printGift(menuOrder, eventResult);
        outputView.printBenefits(eventResult);
        outputView.printTotalBenefits(calculator.getTotalBenefits());
        outputView.printFinalPayment(calculator.calculateFinalPayment());

        outputView.printEventBadge(calculator.getTotalBenefits());
    }
}
