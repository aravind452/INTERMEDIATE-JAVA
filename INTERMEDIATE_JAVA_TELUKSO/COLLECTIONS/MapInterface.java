package COLLECTIONS;

import java.util.*;

public class MapInterface {
  public static void main(String[] args) {

    // HASHMAP

    /*
     * The Map interface in Java is a part of the Java Collections Framework but
     * does not inherit from the Collection interface. It represents a collection of
     * key-value pairs, where each key is unique and maps to exactly one value.
     * Values can be duplicated across different keys. The Map interface provides
     * various implementations, each with different performance characteristics and
     * behaviors regarding order.
     * 
     * 
     * Description: A HashMap uses a hash table for storing key-value pairs. It does
     * not guarantee any order of the elements.
     * Performance: Provides average O(1) time complexity for basic operations like
     * put(), get(), and remove().
     * Key Features:
     * Allows one null key and multiple null values.
     * Not synchronized, so it is not thread-safe.
     */

    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("Apple", 1);
    hashMap.put("Banana", 2);
    hashMap.put("Orange", 3);
    Integer appleValue = hashMap.getOrDefault("Apple", 0) + 1;
    System.out.println("Apple Value " + appleValue); // Output: 2

    Integer cherryValue = hashMap.getOrDefault("Cherry", 0);
    System.out.println("CherryValue " + cherryValue);

    // System.out.println(hashMap.get("Banana")); // Output: 2

    // ENTRY
    /*
     * So, Set<Map.Entry<String, Integer>> means we are creating a set that will
     * hold entries (key-value pairs) where keys are of type String and values are
     * of type Integer.
     * 
     * Map.Entry<String, Integer> is a nested interface within the Map interface
     * that represents a key-value pair in the map.
     */
    Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
    for (Map.Entry<String, Integer> entry : entrySet) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    // Linked Hashmap

    /*
     * Description: A LinkedHashMap maintains the insertion order of elements. It
     * uses a doubly-linked list along with the hash table.
     * Performance: Similar to HashMap, with O(1) time complexity for basic
     * operations. Iterating over the keys and values will follow the order of
     * insertion.
     * Key Features:
     * Allows one null key and multiple null values.
     * Not synchronized.
     */

    // LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
    // linkedHashMap.put("Apple", 1);
    // linkedHashMap.put("Banana", 2);
    // linkedHashMap.put("Orange", 3);

    // for (String key : linkedHashMap.keySet()) {
    // System.out.println(key + ": " + linkedHashMap.get(key));
    // }
    // Output:
    // Apple: 1
    // Banana: 2
    // Orange: 3

    // TreeMap
    /*
     * Description: A TreeMap implements the SortedMap interface and is based on a
     * red-black tree, which keeps keys in natural order or in a specified order
     * using a comparator.
     * Performance: Provides O(log n) time complexity for basic operations.
     * Key Features:
     * Does not allow null keys (but allows null values).
     * Maintains a sorted order based on the keys.
     */

    // TreeMap<String, Integer> treeMap = new TreeMap<>();
    // treeMap.put("Banana", 2);
    // treeMap.put("Apple", 1);
    // treeMap.put("Orange", 3);

    // for (String key : treeMap.keySet()) {
    // System.out.println(key + ": " + treeMap.get(key));
    // }
    // Output:
    // Apple: 1
    // Banana: 2
    // Orange: 3

  }
}
