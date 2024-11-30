package COLLECTIONS;

import java.util.*;

/* List Interface 
When you create an ArrayList in Java, you can set an initial capacity or let it default to a predefined value.

Default Initial Capacity:
If you create an ArrayList without specifying a capacity, the default initial capacity is 10.

When the capacity is exceeded, the ArrayList increases its size by approximately 50% of its current capacity.

For example, if the current capacity is 10, it will increase to 15 (10 + 5). If the capacity is 15, it increases to around 22 (15 + 7), and so on.

*/

public class ListInterface {

  public static void main(String[] args) {

    // ArrayList

    List<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Cherry");
    list.add("Banana");

    System.out.println(list);
    list.add(1, "Date");
    String fruit = list.get(0);
    System.out.println(fruit);
    System.out.println(list);

    // LinkedList - implements both List and Deque

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Apple");
    linkedList.add("Cherry");
    linkedList.add("Banana");

    String firstFruit = linkedList.getFirst();
    String lastFruit = linkedList.getLast();
    System.out.println(firstFruit);
    System.out.println(lastFruit);
    System.out.println(linkedList);

    // Vector - Legacy

    Vector<String> vector = new Vector<>();
    vector.add("A");
    vector.add("B");
    vector.add("C");
    vector.insertElementAt("D", 2);
    System.out.println(vector);

  }

}
