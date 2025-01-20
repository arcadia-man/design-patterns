package behavioral.state.states;

import behavioral.state.Items;
import behavioral.state.VendingMachine;

public class IdleState implements VendingMachineState {
  private VendingMachine vendingMachine;

  public IdleState(VendingMachine vendingMachine) {
    this.vendingMachine = vendingMachine;
  }

  @Override
  public void insertMoney(double amount) {
    throw new UnsupportedOperationException("Please select item first");
  }

  @Override
  public void selectItem(String itemCode) {
    Items item = vendingMachine.getItem(itemCode);
    if (item != null && item.getQuantity() > 0) {
      vendingMachine.setSelectedItemCode(itemCode);
      vendingMachine.setState(vendingMachine.getHasSelectionState());
      System.out.println("Item selected: " + item.getName());
    } else {
      System.out.println("Item unavailable or out of stock.");
    }
  }

  @Override
  public void dispenseItem() {
    throw new UnsupportedOperationException("No item selected.");
  }

  @Override
  public void cancelTransaction() {
    throw new UnsupportedOperationException("No transaction to cancel.");
  }
}
