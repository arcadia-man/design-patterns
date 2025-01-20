package behavioral.state.states;

import behavioral.state.Items;
import behavioral.state.VendingMachine;

public class ProcessingPaymentState implements VendingMachineState {
  private VendingMachine vendingMachine;

  public ProcessingPaymentState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(double amount) {
    vendingMachine.addBalance(amount);
    System.out.println("Money inserted: $" + amount);
  }

  @Override
  public void selectItem(String itemCode) {
    throw new UnsupportedOperationException("Item already selected.");
  }

  @Override
  public void dispenseItem() {
    String itemCode = vendingMachine.getSelectedItemCode();
    Items item = vendingMachine.getItem(itemCode);

    if (vendingMachine.getBalance() >= item.getPrice()) {
      vendingMachine.deductBalance(item.getPrice());
      item.decrementQuantity();
      vendingMachine.setState(vendingMachine.getDispensingState());
      vendingMachine.performDispenseItem();
    } else {
      System.out.println("Insufficient funds. Insert $" + (item.getPrice() - vendingMachine.getBalance()));
    }
  }

  @Override
  public void cancelTransaction() {
    vendingMachine.resetBalance();
    vendingMachine.setState(vendingMachine.getIdleState());
    System.out.println("Transaction cancelled.");
  }
}
