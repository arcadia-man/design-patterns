package structural.decorator.coffee;

public class SimpleCoffee implements Coffee {
  @Override
  public double getCost() {
    return 5.0;
  }

  @Override
  public String getDescription() {
    return "Simple coffee!";
  }
}
