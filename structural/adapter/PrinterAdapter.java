package structural.adapter;

class PrinterAdapter implements ModernPrinter {
  private LegacyPrinter legacyPrinter;

  public PrinterAdapter(LegacyPrinter legacyPrinter) {
    this.legacyPrinter = legacyPrinter;
  }

  @Override
  public void printFormattedText(String text) { // Adapting the method call
    legacyPrinter.printText("[Formatted] " + text);
  }

}