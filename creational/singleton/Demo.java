package creational.singleton;

import creational.singleton.logger.Logger;
import creational.singleton.logger.UserService;

public class Demo {
  public static void main(String[] args) {
    // All logs are written through a single instance, preventing duplication or
    // conflicting configurations.
    // Memory management by avoids creating multiple file writers or log handlers.
    // Any part of the application can access the logger without recreating or
    // passing it explicitly.
    UserService userService = new UserService();
    userService.createUser("Pritam");

    Logger l1 = Logger.getInstance();
    Logger l2 = Logger.getInstance();
    System.out.println(l1 == l2);
  }
}