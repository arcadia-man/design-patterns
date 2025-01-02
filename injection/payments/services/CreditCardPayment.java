package injection.payments.services;

import injection.payments.details.CreditCardDetails;
import injection.payments.details.PaymentDetails;

public class CreditCardPayment implements PaymentService {
  @Override
  public void processPayment(PaymentDetails paymentDetails) {
    if (paymentDetails instanceof CreditCardDetails) {
      CreditCardDetails details = (CreditCardDetails) paymentDetails;
      System.out.println("Processing credit card payment:");
      System.out.println("  Amount: $" + details.getAmount());
      System.out.println("  Card Number: " + details.getCardNumber());
      System.out.println("  Card Holder: " + details.getCardHolderName());
    } else {
      throw new IllegalArgumentException("Invalid payment details for CreditCardPayment.");
    }
  }
}