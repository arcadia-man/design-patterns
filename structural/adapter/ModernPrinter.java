package structural.adapter;

public interface ModernPrinter {
  void printFormattedText(String text);

  // Here is an example of the Adapter Design Pattern implemented in Java. The
  // Adapter Pattern allows a class to work with another class that has a
  // different interface.
  
  // Multiple Inheritance: Interfaces allow a class to implement multiple
  // interfaces, while abstract classes only allow single inheritance.
  
  // Separation of Concerns: Interfaces define contracts without enforcing
  // implementation details, making the system flexible and adhering to the
  // Open/Closed Principle.
  
  // Role-based Design: Interfaces enable objects to take on multiple roles,
  // promoting modularity and reducing unnecessary inheritance hierarchies.
}
