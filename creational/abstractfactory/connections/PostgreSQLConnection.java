package creational.abstractfactory.connections;

public class PostgreSQLConnection implements DatabaseConnection {
  @Override
  public void connect() {
    System.out.println("Connecting to PostgreSQL Database.");
  }
}