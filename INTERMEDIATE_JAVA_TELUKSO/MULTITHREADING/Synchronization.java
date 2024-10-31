package MULTITHREADING;

public class Synchronization {

  public static void main(String[] args) {

    Stack stack = new Stack(5);
    new Thread(() -> {
      int count = 0;
      while (++count < 10)
        System.out.println("Pushed " + stack.push(100));

    }, "Push Thread").start();
    new Thread(() -> {
      int count = 0;
      while (++count < 10)
        System.out.println("Popped " + stack.pop());

    }, "Pop Thread").start();

    System.out.println("main is exiting");
  }

}

class Stack {
  private int[] arr;
  private int stackTop;
  /*
   * n a multi-threaded program, if two threads try to access the same resource
   * (like your stack’s stackTop index) at the same time, they might interfere
   * with each other. This can cause errors, like the
   * ArrayIndexOutOfBoundsException you encountered.
   * Locks are a way to prevent multiple threads from accessing the same resource
   * simultaneously. When a thread “locks” a resource, it’s like putting a “Do Not
   * Disturb” sign on it—no other thread can access it until the lock is removed.
   * 
   * 2. synchronized Keyword
   * When you use the synchronized keyword in Java, it only allows one thread at a
   * time to enter the synchronized section. This helps prevent issues like race
   * conditions.
   * 
   * Instead of making the entire push and pop methods synchronized, we can use a
   * separate lock object to control access to just the critical sections within
   * those methods.
   * 
   * 3. What is a Lock Object?
   * A lock object is simply an instance of Object that we use to mark the
   * sections of code we want to be exclusive (i.e., accessible by only one thread
   * at a time).
   * 
   * In code, locks ensure that only one thread can access a critical section
   * (shared data) at a time to avoid conflicts and errors.
   */
  Object lock, lock1;

  public Stack(int capacity) {
    arr = new int[capacity];
    stackTop = -1;
    lock = new Object();
    // lock1 = new Object();
  }

  public boolean push(int element) {
    // lock
    synchronized (lock) {
      if (isFull())
        return false;
      ++stackTop;
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
      arr[stackTop] = element;
      return true;

    }

  }

  public int pop() {
    // lock
    synchronized (lock) {
      if (isEmpty())
        return Integer.MIN_VALUE;
      int obj = arr[stackTop];
      arr[stackTop] = Integer.MIN_VALUE;

      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        System.out.println(e);
      }
      stackTop--;
      return obj;
    }

  }

  public boolean isEmpty() {
    return stackTop < 0;
  }

  public boolean isFull() {
    return stackTop >= arr.length - 1;
  }
}
