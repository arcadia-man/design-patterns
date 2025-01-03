package injection.payments.details;

public class CreditCardDetails extends PaymentDetails {
  private String cardNumber;
  private String cardHolderName;
  private String expiryDate;
  private String cvv;

  public CreditCardDetails(double amount, String cardNumber, String cardHolderName, String expiryDate, String cvv) {
    super(amount);
    this.cardNumber = cardNumber;
    this.cardHolderName = cardHolderName;
    this.expiryDate = expiryDate;
    this.cvv = cvv;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public String getCardHolderName() {
    return cardHolderName;
  }

  public String getExpiryDate() {
    return expiryDate;
  }

  public String getCvv() {
    return cvv;
  }
}
