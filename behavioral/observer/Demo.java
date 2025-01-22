package behavioral.observer;

public class Demo {
  public static void main(String[] args) {
    NewsAgency agency = new NewsAgency();

    NewsReader reader1 = new NewsReader("Alice");
    NewsReader reader2 = new NewsReader("Bob");

    // Subscribe observers
    agency.subscribe(reader1);
    agency.subscribe(reader2);

    // Publish news
    agency.setNews("Breaking: New Java version released!");

    // Unsubscribe one observer
    agency.unsubscribe(reader1);

    // Publish another news update
    agency.setNews("Update: Observer pattern tutorial available.");
  }
}
