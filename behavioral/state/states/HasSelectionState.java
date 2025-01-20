package behavioral.state.states;

import behavioral.state.VendingMachine;

public class HasSelectionState implements VendingMachineState {
  private VendingMachine vendingMachine;

  public HasSelectionState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(double amount) {
    vendingMachine.addBalance(amount);
    System.out.println("Money inserted: $" + amount);
    vendingMachine.setState(vendingMachine.getProcessingPaymentState());
  }

  @Override
  public void selectItem(String itemCode) {
    System.out.println("Item already selected.");
  }

  @Override
  public void dispenseItem() {
    System.out.println("Please insert money first.");
  }

  @Override
  public void cancelTransaction() {
    vendingMachine.resetBalance();
    vendingMachine.setState(vendingMachine.getIdleState());
    System.out.println("Transaction cancelled.");
  }
}
