package designPatterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== State Design Pattern - Vending Machine Example ===\n");
        
        // Create vending machine with 5 items
        VendingMachine vendingMachine = new VendingMachine(5,5);
        
        // Scenario 1: Successful purchase
        System.out.println("--- Scenario 1: Successful Purchase ---");
        vendingMachine.insertMoney(15);
        vendingMachine.selectItem();
        System.out.println();
        
        // Scenario 2: Insufficient money
        System.out.println("--- Scenario 2: Insufficient Money ---");
        vendingMachine.insertMoney(5);
        vendingMachine.selectItem();
        vendingMachine.refund();
        System.out.println();
        
        // Scenario 3: Multiple money insertions
        System.out.println("--- Scenario 3: Multiple Money Insertions ---");
        vendingMachine.insertMoney(5);
        vendingMachine.insertMoney(3);
        vendingMachine.insertMoney(4);
        vendingMachine.selectItem();
        System.out.println();
        
        // Scenario 4: Try to select without money
        System.out.println("--- Scenario 4: Select Without Money ---");
        vendingMachine.selectItem();
        System.out.println();
        
        // Scenario 5: Try to dispense without selection
        System.out.println("--- Scenario 5: Dispense Without Selection ---");
        vendingMachine.dispenseItem();
        System.out.println();
        
        // Scenario 6: Refund with no money
        System.out.println("--- Scenario 6: Refund With No Money ---");
        vendingMachine.refund();
        System.out.println();
        
        // Scenario 7: Purchase remaining items
        System.out.println("--- Scenario 7: Purchase Remaining Items ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("Purchase #" + (i + 1));
            vendingMachine.insertMoney(10);
            vendingMachine.selectItem();
            System.out.println();
        }
        
        // Scenario 8: Out of stock
        System.out.println("--- Scenario 8: Out of Stock ---");
        vendingMachine.insertMoney(10);
        vendingMachine.selectItem();
    }
}
