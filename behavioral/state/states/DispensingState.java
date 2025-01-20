package behavioral.state.states;

import behavioral.state.Items;
import behavioral.state.VendingMachine;

public class DispensingState implements VendingMachineState {
  private VendingMachine vendingMachine;

	public DispensingState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	@Override
	public void insertMoney(double amount) {
		throw new UnsupportedOperationException("Please wait. Dispensing item...");
	}

	@Override
	public void selectItem(String itemCode) {
		throw new UnsupportedOperationException("Please wait. Dispensing item...");
	}

	@Override
	public void dispenseItem() {
		String itemCode = vendingMachine.getSelectedItemCode();
		Items item = vendingMachine.getItem(itemCode);
		System.out.println("Dispensing item: " + item.getName());
		vendingMachine.setState(vendingMachine.getIdleState());
	}

	@Override
	public void cancelTransaction() {
		throw new UnsupportedOperationException("Cannot cancel during dispensing.");
	}
}
