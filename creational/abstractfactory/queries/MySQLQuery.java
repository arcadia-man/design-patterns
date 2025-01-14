package creational.abstractfactory.queries;

public class MySQLQuery implements DatabaseQuery {
	@Override
	public void executeQuery(String query) {
		System.out.println("Executing MySQL query: " + query);
	}
}
