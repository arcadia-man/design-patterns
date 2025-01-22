package behavioral.iterator;

import java.util.Arrays;
import java.util.List;

import behavioral.iterator.iterators.BookCollection;
import behavioral.iterator.iterators.CusIterator;

public class Demo {
  public static void main(String[] args) {
    
    // I want to make a book self
    List<String> bookList = Arrays.asList("The Hobbit", "1984", "The Catcher in the Rye");
    BookCollection bookCollection = new BookCollection(bookList);
    
    // Now i don't know how it has been stored but i want to get all the books sequentially. 
    // We need to have iterator in my collection 
    CusIterator iterator =  bookCollection.createIterator();

    System.out.println("Books in the collection:");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
