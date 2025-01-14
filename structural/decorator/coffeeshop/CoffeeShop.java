package structural.decorator.coffeeshop;

import java.lang.reflect.Method;
import structural.decorator.coffee.Coffee;
import structural.decorator.coffee.MilkDecorator;
import structural.decorator.coffee.SimpleCoffee;
import structural.decorator.coffee.SugarDecorator;

public class CoffeeShop {
  private Coffee coffee;
  
  public CoffeeShop(){
    this.coffee = new SimpleCoffee();
  }

  public Coffee decorateWithMilk() {
    this.coffee = new MilkDecorator(this.coffee);
    return this.coffee;
  }

  public Coffee decorateWithSugar() {
    this.coffee = new SugarDecorator(this.coffee);
    return this.coffee;
  }

  public Coffee applyDecoratorsDynamic(String[] decorators) {
    // implement validator for the option avalible currently - in future
    for (String decorator : decorators) {
      try {
        Method method = this.getClass().getMethod("decorateWith" + decorator);
        this.coffee = (Coffee) method.invoke(this);
        System.out.println(this.coffee.getDescription() + " $" + this.coffee.getCost());
      } catch (Exception e) {
        throw new RuntimeException("Error applying decorator: " + decorator, e);
      }
    }
    return this.coffee;
  }
}