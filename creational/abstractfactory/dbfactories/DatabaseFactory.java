package creational.abstractfactory.dbfactories;

import creational.abstractfactory.connections.DatabaseConnection;
import creational.abstractfactory.queries.DatabaseQuery;

public interface DatabaseFactory {
  DatabaseConnection createConnection();
  DatabaseQuery createQuery();
}