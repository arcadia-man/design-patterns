package injection.payments.details;

public abstract class PaymentDetails {
  private double amount;

  public PaymentDetails(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }
}
