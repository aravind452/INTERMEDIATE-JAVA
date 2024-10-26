package MULTITHREADING;

public class Synchronization {

  public static void main(String[] args) {
    // Create two threads
    new Thread(() -> {

    }, "Thread 1");
  }

}

class Stack {
  private int[] arr;
  private int stackTop;

  public Stack(int capacity) {
    arr = new int[capacity];
    stackTop = -1;
  }

  public boolean push(int element) {
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

  public int pop() {
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

  public boolean isEmpty() {
    return stackTop < 0;
  }

  public boolean isFull() {
    return stackTop >= arr.length - 1;
  }
}
