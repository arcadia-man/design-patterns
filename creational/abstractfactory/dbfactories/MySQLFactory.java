package creational.abstractfactory.dbfactories;

import creational.abstractfactory.connections.DatabaseConnection;
import creational.abstractfactory.connections.MySQLConnection;
import creational.abstractfactory.queries.DatabaseQuery;
import creational.abstractfactory.queries.MySQLQuery;

public class MySQLFactory implements DatabaseFactory {
  @Override
  public DatabaseConnection createConnection() {
    return new MySQLConnection();
  }

  @Override
  public DatabaseQuery createQuery() {
    return new MySQLQuery();
  }
}