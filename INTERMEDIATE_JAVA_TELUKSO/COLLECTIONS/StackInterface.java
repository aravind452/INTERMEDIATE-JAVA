package COLLECTIONS;

import java.util.*;

public class StackInterface {

  public static void main(String[] args) {

    // STACK

    /*
     * In Java, the Stack class is a legacy class that extends Vector and implements
     * a Last In First Out (LIFO) data structure. While Stack is part of the Java
     * Collections Framework, it is generally recommended to use more modern
     * alternatives like ArrayDeque for stack operations because Stack has some
     * performance drawbacks, primarily due to its inheritance from Vector, which is
     * synchronized by default.
     */

    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println(stack.peek()); // Output: 30 (element at the top)
    System.out.println(stack.pop()); // Output: 30 (removes top element)
    System.out.println(stack.empty()); // Output: false (stack still contains elements)

    // Why Use ArrayDeque Over Stack?

    /*
     * ArrayDeque is preferred for stack operations due to the following reasons:
     * 
     * Faster performance: ArrayDeque is faster than Stack because it is not
     * synchronized. It is a non-blocking data structure, meaning no overhead for
     * synchronization unless required.
     * Modern implementation: ArrayDeque is part of the modern Java Collections
     * Framework and is designed with better performance in mind. The Stack class is
     * part of the older legacy classes.
     * No resizing overhead like Vector: Stack inherits from Vector, which resizes
     * in chunks. ArrayDeque, on the other hand, grows dynamically as needed with
     * less overhead.
     */

    ArrayDeque<String> stackUsingArrayDeque = new ArrayDeque<>();
    stackUsingArrayDeque.push("First");
    stackUsingArrayDeque.push("Second");
    stackUsingArrayDeque.push("Third");

    System.out.println(stackUsingArrayDeque.peek()); // Output: "Third" (top of the stack)
    System.out.println(stackUsingArrayDeque.pop()); // Output: "Third" (removes the top element)
    System.out.println(stackUsingArrayDeque.isEmpty()); // Output: false (stack still contains elements)

  }

}
