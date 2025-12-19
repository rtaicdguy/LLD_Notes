package design.patterns.behavioral.state.states;

import design.patterns.behavioral.state.VendingMachine;

public class IdleState implements State {
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Money inserted: $" + money);
        vendingMachine.insertCoins(money);
        vendingMachine.setCurrentState(vendingMachine.getHasMoneyState());
    }

    @Override
    public void selectItem() {
        System.out.println("Please insert money first!");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please insert money and select item first!");
    }

    @Override
    public void refund() {
        System.out.println("No money to refund!");
    }
}
