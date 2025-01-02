package injection.payments.services;

import injection.payments.details.PaymentDetails;

public interface PaymentService {
  void processPayment(PaymentDetails paymentDetails);
}
