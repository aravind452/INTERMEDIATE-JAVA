package COLLECTIONS;

import java.util.*;

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
