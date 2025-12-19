package design.patterns.behavioral.state;

import design.patterns.behavioral.state.states.DispensingState;
import design.patterns.behavioral.state.states.HasMoneyState;
import design.patterns.behavioral.state.states.IdleState;
import design.patterns.behavioral.state.states.State;

public class VendingMachine {
    private State currentState;
    private int itemCount;
    private int itemPrice;
    private int insertedCoins;

    private State dispensingState;
    private State hasMoneyState;
    private State idleState;

    public VendingMachine(int itemCount, int itemPrice) {
        this.itemCount = itemCount;
        this.itemPrice = itemPrice;
        this.insertedCoins = 0;
        
        this.dispensingState = new DispensingState(this);
        this.hasMoneyState = new HasMoneyState(this);
        this.idleState = new IdleState(this);

        this.currentState = idleState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    public State getCurrentState() {
        return currentState;
    }

    public State getIdleState() {
        return this.idleState;
    }

    public State getHasMoneyState() {
        return this.hasMoneyState;
    }

    public State getDispensingState() {
        return this.dispensingState;
    }

    public void insertCoins(int coins) {
        this.insertedCoins += coins;
    }

    public void resetCoins() {
        this.insertedCoins = 0;
    }

    public int getInsertedCoins() {
        return this.insertedCoins;
    }

    public int getItemPrice() {
        return this.itemPrice;
    }

    public void addItems(int count) {
        this.itemCount += count;
    }

    public void removeItem() {
        this.itemCount -= 1;
    }

    public int getItemCount() {
        return this.itemCount;
    }

    // Delegate methods to current state
    public void insertMoney(int money) {
        currentState.insertMoney(money);
    }

    public void selectItem() {
        currentState.selectItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void refund() {
        currentState.refund();
    }
}
