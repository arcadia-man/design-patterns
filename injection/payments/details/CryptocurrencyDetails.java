package injection.payments.details;

public class CryptocurrencyDetails extends PaymentDetails {
  private String walletAddress;

  public CryptocurrencyDetails(double amount, String walletAddress) {
    super(amount);
    this.walletAddress = walletAddress;
  }

  public String getWalletAddress() {
    return walletAddress;
  }
}
