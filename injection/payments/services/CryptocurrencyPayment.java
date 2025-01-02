package injection.payments.services;

import injection.payments.details.CryptocurrencyDetails;
import injection.payments.details.PaymentDetails;

public class CryptocurrencyPayment implements PaymentService {
  @Override
  public void processPayment(PaymentDetails paymentDetails) {
    if (paymentDetails instanceof CryptocurrencyDetails) {
      CryptocurrencyDetails details = (CryptocurrencyDetails) paymentDetails;
      System.out.println("Processing cryptocurrency payment:");
      System.out.println("  Amount: $" + details.getAmount());
      System.out.println("  Wallet Address: " + details.getWalletAddress());
    } else {
      throw new IllegalArgumentException("Invalid payment details for CryptocurrencyPayment.");
    }
  }
}
