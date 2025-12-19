package design.patterns.behavioral.state.states;

import design.patterns.behavioral.state.VendingMachine;

public class DispensingState implements State {
    private VendingMachine vendingMachine;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int money) {
        System.out.println("Please wait, dispensing in progress...");
    }

    @Override
    public void selectItem() {
        System.out.println("Please wait, dispensing in progress...");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensed successfully!");
        
        // Deduct item count
        vendingMachine.removeItem();
        
        // Calculate and return change
        int change = vendingMachine.getInsertedCoins() - vendingMachine.getItemPrice();
        if (change > 0) {
            System.out.println("Returning change: $" + change);
        }
        
        // Reset coins and go back to idle state
        vendingMachine.resetCoins();
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
        
        System.out.println("Items remaining: " + vendingMachine.getItemCount());
    }

    @Override
    public void refund() {
        System.out.println("Cannot refund during dispensing!");
    }
}
