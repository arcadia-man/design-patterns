package injection.payments.logger;

public interface PaymentLogger {
  void logTransaction(String account, double amount);
}
