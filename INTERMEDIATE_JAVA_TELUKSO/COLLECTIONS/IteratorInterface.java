package COLLECTIONS;

import java.util.*;

public class IteratorInterface {

  public static void main(String[] args) {

    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Cherry");

    /*
     * Collection Class Provides Iterator: Each collection class implements the
     * Iterable interface, which includes the iterator() method. When you call this
     * method on a collection, it returns an Iterator object specific to that
     * collection.
     */

    Iterator<String> iterator = fruits.iterator();

    while (iterator.hasNext()) {
      String fruit = iterator.next(); // Retrieve the current element and move to the next
      System.out.println(fruit); // This prints the current element
    }

  }

}
