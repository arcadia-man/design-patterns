package behavioral.iterator.iterators;

import java.util.List;

public class BookCollection implements IterableCollection {
  private List<String> books;

  public BookCollection(List<String> books) {
    this.books = books;
  }

  @Override
  public CusIterator createIterator() {
    // build an Custom Iterator for book collection
    return new BookIterator(this.books);
  }
}
