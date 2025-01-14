package creational.abstractfactory;

import creational.abstractfactory.connections.DatabaseConnection;
import creational.abstractfactory.dbfactories.DatabaseFactory;
import creational.abstractfactory.dbfactories.MySQLFactory;
import creational.abstractfactory.dbfactories.PostgreSQLFactory;
import creational.abstractfactory.queries.DatabaseQuery;

public class Demo {
  public static void main(String[] args) {
    // The Abstract Factory Pattern is a design pattern that provides an interface
    // for creating families of related or dependent objects without specifying
    // their concrete classes. It is used when a system should be independent of how
    // its objects are created, composed, and represented.

    // Key Concepts:
    // Abstract Factory: An interface that declares methods for creating abstract
    // product families.
    
    // Concrete Factories: Implementations of the abstract factory, creating
    // specific product families.
    
    // Abstract Product: Interfaces or abstract classes for a family of products.
    // Concrete Products: Specific implementations of the abstract products.
    
    // Here MySQL factory is responsible to make connection, create queries and execution.
    
    DatabaseFactory mySQLFactory = new MySQLFactory();
    DatabaseConnection mySQLConnection = mySQLFactory.createConnection();
    DatabaseQuery mySQLQuery = mySQLFactory.createQuery();

    mySQLConnection.connect();
    mySQLQuery.executeQuery("SELECT * FROM users");

    DatabaseFactory postgreSQLFactory = new PostgreSQLFactory();
    DatabaseConnection postgreSQLConnection = postgreSQLFactory.createConnection();
    DatabaseQuery postgreSQLQuery = postgreSQLFactory.createQuery();

    postgreSQLConnection.connect();
    postgreSQLQuery.executeQuery("SELECT * FROM products");
  }

}