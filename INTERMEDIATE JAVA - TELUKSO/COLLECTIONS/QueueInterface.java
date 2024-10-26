package COLLECTIONS;

import java.util.*;

public class QueueInterface {

  public static void main(String[] args) {

    // Priority Queue

    /*
     * PriorityQueue is a priority-based queue that orders elements according to
     * their natural ordering (if the elements implement Comparable), or according
     * to a custom comparator specified at the time of queue creation. Unlike
     * regular queues, the order in which elements are dequeued (removed) is based
     * on their priority, not their insertion order. Lower priority values are
     * dequeued first.
     * 
     * No FIFO guarantee: Elements are removed based on priority, not insertion
     * order.
     * No null elements: Does not allow null values.
     * Dynamic resizing: Grows as needed.
     * O(log n) for insertion and removal: The internal structure is a binary heap,
     * ensuring that adding or removing elements takes logarithmic time.
     */

    // PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    // priorityQueue.offer(10);
    // priorityQueue.offer(5);
    // priorityQueue.offer(20);
    // System.out.println(priorityQueue);
    // System.out.println(priorityQueue.poll());
    // System.out.println(priorityQueue.peek());

    // LinkedList

    /*
     * LinkedList implements both the List and Queue interfaces, making it a
     * versatile data structure that can also be used as a queue. When used as a
     * queue, LinkedList follows the FIFO principle, where elements are added at the
     * end and removed from the front.
     * 
     * Doubly-linked list: LinkedList is internally a doubly-linked list, making
     * insertion and removal operations efficient.
     * FIFO: When used as a queue, it processes elements in the order they were
     * added.
     * Allows null elements: Unlike PriorityQueue, LinkedList allows null elements
     * when used as a queue.
     */

    // Queue<String> linkedListQueue = new LinkedList<>();
    // linkedListQueue.offer("A");
    // linkedListQueue.offer("B");
    // linkedListQueue.offer("C");
    // System.out.println(linkedListQueue.poll());
    // System.out.println(linkedListQueue.peek());

    // ArrayDeque (as a Queue)

    /*
     * ArrayDeque is a resizable array that can be used as both a queue (FIFO) and a
     * deque (double-ended queue). When used as a queue, ArrayDeque operates in a
     * similar manner to LinkedList, but without the overhead of node allocations
     * (as it is array-based). ArrayDeque is often preferred over LinkedList for
     * queue operations due to better performance.
     * 
     * 
     * When used as a queue, ArrayDeque follows the FIFO (First In, First Out)
     * principle:
     * 
     * Elements are added at the end (tail) of the queue using methods like offer().
     * Elements are removed from the front (head) of the queue using methods like
     * poll().
     * 
     * 
     * ArrayDeque as a Deque (Double-Ended Queue)
     * In addition to functioning as a regular queue, ArrayDeque can be used as a
     * deque, which allows:
     * 
     * Insertion and removal from both ends: You can add or remove elements from
     * both the front and back of the deque, making it suitable for both FIFO and
     * LIFO (Last In First Out) operations.
     * This makes ArrayDeque highly flexible, as it can act like both a queue and a
     * stack:
     * 
     * Queue (FIFO): Use methods like offerLast() to add elements to the back and
     * pollFirst() to remove from the front.
     * Stack (LIFO): Use methods like push() to add elements to the front and pop()
     * to remove from the front, mimicking stack operations.
     */

    ArrayDeque<String> queue = new ArrayDeque<>();
    queue.offer("Element 2");
    queue.offer("Element 1");
    queue.offer("Element 3");
    System.out.println(queue);

    System.out.println(queue.poll()); // Output: "Element 2" (FIFO order)
    System.out.println(queue.peek()); // Output: "Element 1" (next element to be dequeued)

    ArrayDeque<Integer> deque = new ArrayDeque<>();
    deque.offerFirst(10); // Adds 10 to the front
    deque.offerLast(20); // Adds 20 to the back
    deque.push(55); // Pushes 5 to the front (stack-like behavior)

    System.out.println(deque);

    System.out.println(deque.pollFirst()); // Output: 5 (removes from the front)
    System.out.println(deque.pollLast()); // Output: 20 (removes from the back)

  }

}
