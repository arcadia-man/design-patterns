package creational.abstractfactory.dbfactories;

import creational.abstractfactory.connections.DatabaseConnection;
import creational.abstractfactory.connections.PostgreSQLConnection;
import creational.abstractfactory.queries.DatabaseQuery;
import creational.abstractfactory.queries.PostgreSQLQuery;

public class PostgreSQLFactory implements DatabaseFactory {
  @Override
  public DatabaseConnection createConnection() {
    return new PostgreSQLConnection();
  }

  @Override
  public DatabaseQuery createQuery() {
    return new PostgreSQLQuery();
  }
}