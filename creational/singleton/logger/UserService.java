package creational.singleton.logger;

public class UserService {
  private final Logger logger = Logger.getInstance();

  public void createUser(String username) {
    logger.log("User created: " + username);
  }
}
