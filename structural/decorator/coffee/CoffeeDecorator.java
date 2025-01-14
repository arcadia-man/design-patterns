package structural.decorator.coffee;

public class CoffeeDecorator implements Coffee {
  public Coffee decoratedCoffee;

  public CoffeeDecorator(Coffee coffee) {
    this.decoratedCoffee = coffee;
  }

  @Override
  public double getCost() {
    return this.decoratedCoffee.getCost();
  }

  @Override
  public String getDescription() {
    return this.decoratedCoffee.getDescription();
  }
}
