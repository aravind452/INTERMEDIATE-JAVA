package COLLECTIONS;

import java.util.*;

public class SetInterface {

  public static void main(String[] args) {

    // HashSet
    /*
     * HashSet is a collection that uses a hash table for storing elements. It does
     * not guarantee any specific order of elements, meaning the insertion order is
     * not maintained. HashSet provides constant-time performance (O(1)) for basic
     * operations like add, remove, and contains, assuming the hash function
     * distributes elements properly.
     * No order guaranteed: The elements are unordered, meaning their position is
     * determined by their hash codes.
     */

    // Set<String> hashSet = new HashSet<>();
    // hashSet.add("Apple");
    // hashSet.add("Banana");
    // hashSet.add("Cherry");
    // hashSet.add("Date");
    // System.out.println(hashSet.getClass());

    // System.out.println(hashSet);
    // boolean value = hashSet.contains("Apple");
    // System.out.println(value); // Output: true

    // LinkedHashSet
    /*
     * LinkedHashSet is a subclass of HashSet that maintains the insertion order of
     * elements. It combines the performance advantages of HashSet with the ability
     * to iterate over the elements in the order they were inserted.
     * 
     * Maintains insertion order: Elements are returned in the order in which they
     * were inserted.
     * 
     * LinkedHashSet uses a combination of a hash table (like HashSet) and a
     * doubly-linked list.
     * 
     * Hash table for fast access: The hash table is used to store elements and
     * provide O(1) time complexity for basic operations like add, remove, and
     * contains.
     * 
     * 
     * Doubly-linked list for maintaining order: The linked list keeps track of the
     * order in which elements are inserted, allowing it to maintain insertion order
     * during iteration.
     * 
     */

    // Set<String> linkedHashSet = new LinkedHashSet<>();
    // linkedHashSet.add("Apple");
    // linkedHashSet.add("Banana");
    // linkedHashSet.add("Cherry");
    // for (String fruit : linkedHashSet) {
    // System.out.println(fruit);
    // }

    // TreeSet
    /*
     * TreeSet is a sorted set implementation backed by a Red-Black tree. Elements
     * are stored in sorted order, either by their natural order (as defined by
     * Comparable) or according to a custom Comparator provided at the time of
     * creation. Since TreeSet is based on a tree structure, its performance is
     * O(log n) for basic operations like add, remove, and contains.
     * 
     * Underlying Data Structure: TreeSet is implemented using a Red-Black tree, a
     * type of self-balancing binary search tree (BST).
     * 
     * 
     * Sorted elements: The TreeSet does not use a hash table at all. Instead, the
     * Red-Black tree allows TreeSet to maintain the elements in sorted order, with
     * basic operations (add, remove, contains) performed in O(log n) time.
     * 
     * 
     * Ordering: Elements are sorted according to their natural order (as defined by
     * Comparable) or a custom Comparator provided at the time of construction.
     */

    TreeSet<Integer> treeSet = new TreeSet<>();
    treeSet.add(3);
    treeSet.add(1);
    treeSet.add(2);
    treeSet.add(5);
    for (int num : treeSet) {
      System.out.println(num);
    }
    Integer firstElement = treeSet.first();
    Integer lastElement = treeSet.last();
    System.out.println(firstElement);
    System.out.println(lastElement);

  }

}
