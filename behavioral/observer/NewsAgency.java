package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
  private String news;
  private List<Observer> observers = new ArrayList<>();

  @Override
  public void subscribe(Observer observer) {
    observers.add(observer);
    System.out.println(observer.getName() + " Observer subscribed.");

  }

  @Override
  public void unsubscribe(Observer observer) {
    observers.remove(observer);
    System.out.println(observer.getName() + " Observer unsubscribed.");
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.readMessage(news);
    }
  }

  public void setNews(String news) {
    this.news = news;
    System.out.println("News updated: " + news);
    notifyObservers();
  }

}
