package injection.payments;

import injection.payments.details.CreditCardDetails;
import injection.payments.details.CryptocurrencyDetails;
import injection.payments.details.PayPalDetails;
import injection.payments.details.PaymentDetails;
import injection.payments.services.CreditCardPayment;
import injection.payments.services.CryptocurrencyPayment;
import injection.payments.services.PayPalPayment;
import injection.payments.services.PaymentService;

public class Demo {
  public static void main(String[] args) {
    PaymentDetails creditCardDetails = new CreditCardDetails(150.75, "1234-5678-9012-3456", "John Doe", "12/25", "123");
    PaymentService creditCardService = new CreditCardPayment();
    PaymentProcessor creditCardProcessor = new PaymentProcessor(creditCardService);
    creditCardProcessor.process(creditCardDetails);

    // PayPal Payment
    PaymentDetails payPalDetails = new PayPalDetails(300.50, "user@paypal.com");
    PaymentService payPalService = new PayPalPayment();
    PaymentProcessor payPalProcessor = new PaymentProcessor(payPalService);
    payPalProcessor.process(payPalDetails);

    // Cryptocurrency Payment
    PaymentDetails cryptoDetails = new CryptocurrencyDetails(500.00, "1A2b3C4d5E6F7g");
    PaymentService cryptoService = new CryptocurrencyPayment();
    PaymentProcessor cryptoProcessor = new PaymentProcessor(cryptoService);
    cryptoProcessor.process(cryptoDetails);
    
    // Perciving like -> paymentProcessor.processWith(paymentDetail)
    // We are injecting the paymentServiceType to PaymentProcessor
  }
}
