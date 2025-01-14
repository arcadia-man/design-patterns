package creational.factory;

public class Demo {
  public static void main(String[] args) {
    DatabaseConnectionFactory factory = new DatabaseConnectionFactory();

    // Create MySQL connection
    DatabaseConnection mySQLConnection = factory.createConnection("mysql");
    mySQLConnection.connect(); // Output: Connecting to MySQL Database.

    // Create PostgreSQL connection
    DatabaseConnection postgreSQLConnection = factory.createConnection("postgresql");
    postgreSQLConnection.connect(); // Output: Connecting to PostgreSQL Database.

    // Create MongoDB connection
    DatabaseConnection mongoDBConnection = factory.createConnection("mongodb");
    mongoDBConnection.connect(); // Output: Connecting to MongoDB Database.
  }
}
