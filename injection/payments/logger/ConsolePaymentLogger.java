package injection.payments.logger;

public class ConsolePaymentLogger implements PaymentLogger {
  
  @Override
  public void logTransaction(String account, double amount) {
    System.out.println("Logged transaction: $" + amount + " for account " + account);
  }
}