package creational.abstractfactory.queries;

public class PostgreSQLQuery implements DatabaseQuery {
  @Override
  public void executeQuery(String query) {
    System.out.println("Executing PostgreSQL query: " + query);
  }
}
