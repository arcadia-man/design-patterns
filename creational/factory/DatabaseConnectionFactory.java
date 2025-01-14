package creational.factory;

public class DatabaseConnectionFactory {

  public DatabaseConnection createConnection(String type) {
    switch (type.toLowerCase()) {
      case "mysql":
        return new MySQLConnection();
      case "postgresql":
        return new PostgreSQLConnection();
      case "mongodb":
        return new MongoDBConnection();
      default:
        throw new Error("Invalid db.");
    }
  }

}
