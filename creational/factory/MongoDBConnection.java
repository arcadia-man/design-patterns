package creational.factory;

public class MongoDBConnection implements DatabaseConnection {

  @Override
  public void connect() {
    System.out.println("Connecting to MongoDB Database.");
  }
}
