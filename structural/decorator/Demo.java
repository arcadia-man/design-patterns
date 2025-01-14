package structural.decorator;

import java.util.Scanner;
import structural.decorator.coffeeshop.CoffeeShop;

public class Demo {
  // serves the coffee
  public void serve(String[] decorators) {
    // Open shop
    CoffeeShop shop = new CoffeeShop();
    // Serve the coffe with dynamic options.
    shop.applyDecoratorsDynamic(decorators);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Demo demo = new Demo();
    while (true) {
      System.out.println("Enter decorators separated by commas (e.g., Milk,Sugar) or type 'exit' to stop:");
      String input = scanner.nextLine();
      if (input.equalsIgnoreCase("exit")) {
        System.out.println("Exiting the program.");
        break;
      }
      String[] decorators = input.split(",");
      for (int i = 0; i < decorators.length; i++) {
        decorators[i] = decorators[i].trim();
      }
      demo.serve(decorators);
    }
    scanner.close();
  }
}
