package injection.payments.services;

import injection.payments.details.PayPalDetails;
import injection.payments.details.PaymentDetails;

// PayPalPayment.java
public class PayPalPayment implements PaymentService {
 @Override
 public void processPayment(PaymentDetails paymentDetails) {
     if (paymentDetails instanceof PayPalDetails) {
         PayPalDetails details = (PayPalDetails) paymentDetails;
         System.out.println("Processing PayPal payment:");
         System.out.println("  Amount: $" + details.getAmount());
         System.out.println("  Email: " + details.getEmail());
     } else {
         throw new IllegalArgumentException("Invalid payment details for PayPalPayment.");
     }
 }
}
