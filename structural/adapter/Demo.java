package structural.adapter;

public class Demo {
  public static void main(String[] args) {
    // Create a LegacyPrinter instance
    LegacyPrinter legacyPrinter = new LegacyPrinter();

    // Use the adapter to bridge the gap. It hold the all the properties of legacy and new.
    ModernPrinter modernPrinter = new PrinterAdapter(legacyPrinter);

    // Use the modern interface
    modernPrinter.printFormattedText("Hello, Adapter Pattern!");
  }
}
