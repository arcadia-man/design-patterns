package behavioral.observer;

public class NewsReader implements Observer {
  private String name;

  public NewsReader(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void readMessage(String message) {
    System.out.println(name + " received news update: " + message);
  }
}
