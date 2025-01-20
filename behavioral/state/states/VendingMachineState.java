package behavioral.state.states;

public interface VendingMachineState {
	void insertMoney(double amount);

	void selectItem(String itemCode);

	void dispenseItem();

	void cancelTransaction();
}
