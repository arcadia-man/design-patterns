package injection.payments.details;

public class PayPalDetails extends PaymentDetails {
  private String email;

  public PayPalDetails(double amount, String email) {
    super(amount);
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
}
