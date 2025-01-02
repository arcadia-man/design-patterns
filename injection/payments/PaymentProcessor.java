package injection.payments;

import injection.payments.details.PaymentDetails;
import injection.payments.services.PaymentService;

public class PaymentProcessor {
  private final PaymentService paymentService;

  public PaymentProcessor(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public void process(PaymentDetails paymentDetails) {
    paymentService.processPayment(paymentDetails);
  }
}
