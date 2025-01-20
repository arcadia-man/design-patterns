package behavioral.state;

import java.util.*;

import behavioral.state.states.*;

public class VendingMachine {
  private VendingMachineState idleState;
  private VendingMachineState hasSelectionState;
  private VendingMachineState processingPaymentState;
  private VendingMachineState dispensingState;

  private VendingMachineState currentState;
  private double currentBalance = 0.0;
  private String selectedItemCode = null;

  private Map<String, Items> inventory = new HashMap<>();

  VendingMachine() {
    idleState = new IdleState(this);
    hasSelectionState = new HasSelectionState(this);
    processingPaymentState = new ProcessingPaymentState(this);
    dispensingState = new DispensingState(this);
    currentState = idleState;
  }

  public void addItem(String itemCode, String itemName, double price, int quantity) {
    System.out.println(itemCode + " " + itemName + " " + quantity + " " + price);
    inventory.put(itemCode, new Items(itemName, price, quantity));
  }

  public void setState(VendingMachineState state) {
    currentState = state;
  }

  public VendingMachineState getIdleState() {
    return idleState;
  }

  public VendingMachineState getHasSelectionState() {
    return hasSelectionState;
  }

  public VendingMachineState getProcessingPaymentState() {
    return processingPaymentState;
  }

  public VendingMachineState getDispensingState() {
    return dispensingState;
  }

  public void performInsertMoney(double amount) {
    currentState.insertMoney(amount);
  }

  public void performSelectItem(String itemCode) {
    currentState.selectItem(itemCode);
  }

  public void performDispenseItem() {
    currentState.dispenseItem();
  }

  public void performCancelTransaction() {
    currentState.cancelTransaction();
  }

  public void addBalance(double amount) {
    currentBalance += amount;
  }

  public double getBalance() {
    return currentBalance;
  }

  public void deductBalance(double amount) {
    currentBalance -= amount;
  }

  public void resetBalance() {
    currentBalance = 0.0;
  }

  public Items getItem(String itemCode) {
    return inventory.get(itemCode);
  }

  public void setSelectedItemCode(String itemCode) {
    selectedItemCode = itemCode;
  }

  public String getSelectedItemCode() {
    return selectedItemCode;
  }

  public static void main(String[] args) {
    VendingMachine vendingMachine = new VendingMachine();
    vendingMachine.addItem("A1", "Chips", 1.50, 10);
    vendingMachine.addItem("B1", "Soda", 2.00, 5);


    try {
      vendingMachine.performSelectItem("A1");
      vendingMachine.performInsertMoney(1.40);
      vendingMachine.performInsertMoney(1.40);
      vendingMachine.performDispenseItem();
    } catch (Exception e) {
      System.out.println(e);
    }

  }
}
