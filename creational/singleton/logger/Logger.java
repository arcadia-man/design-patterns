package creational.singleton.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
  private PrintWriter writer;
  private static Logger loggerInstance;
  
  private Logger() {
    try {
      writer = new PrintWriter(new FileWriter("application.log", true), true);
    } catch (IOException e) {
      System.err.println("Failed to initialize logger: " + e.getMessage());
    }
  }

  public static synchronized Logger getInstance() {
    if (loggerInstance == null) {
      loggerInstance = new Logger();
    }
    return loggerInstance;
  }

  public void log(String msg) {
    System.out.println(msg);
    writer.println(LocalDateTime.now() + " " + msg);
  }

  public void close() {
    writer.close();
  }
}
