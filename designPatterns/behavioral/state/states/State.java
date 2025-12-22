package designPatterns.behavioral.state.states;

public interface State {
    void insertMoney(int money);
    void selectItem();
    void dispenseItem();
    void refund();
}
