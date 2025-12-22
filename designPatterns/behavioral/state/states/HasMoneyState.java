package designPatterns.behavioral.state.states;

import designPatterns.behavioral.state.VendingMachine;

public class HasMoneyState implements State {
    private VendingMachine vendingMachine;

    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Additional money inserted: $" + money);
        vendingMachine.insertCoins(money);
    }

    @Override
    public void selectItem() {
        if (vendingMachine.getItemCount() == 0) {
            System.out.println("Out of stock! Refunding money...");
            refund();
            return;
        }

        if (vendingMachine.getInsertedCoins() < vendingMachine.getItemPrice()) {
            System.out.println("Insufficient money! Item costs $" + vendingMachine.getItemPrice() + 
                             ". You have $" + vendingMachine.getInsertedCoins());
            return;
        }

        System.out.println("Item selected. Dispensing...");
        vendingMachine.setCurrentState(vendingMachine.getDispensingState());
        vendingMachine.dispenseItem();
    }

    @Override
    public void dispenseItem() {
        System.out.println("Please select an item first!");
    }

    @Override
    public void refund() {
        System.out.println("Refunding $" + vendingMachine.getInsertedCoins());
        vendingMachine.resetCoins();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }
}
