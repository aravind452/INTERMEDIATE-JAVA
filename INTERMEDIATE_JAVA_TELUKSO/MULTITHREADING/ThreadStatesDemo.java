package MULTITHREADING;

public class ThreadStatesDemo {

  public static void main(String[] args) {
    Thread thread1 = new Thread(new MyRunnable(), "Thread-1");

    // Thread is in NEW state
    System.out.println(thread1.getName() + " is in state: " + thread1.getState());

    thread1.start(); // Start the thread, now it's in RUNNABLE state

    // Give the thread some time to start and move to RUNNABLE state
    try {
      Thread.sleep(100); // Main thread sleeps for 100 milliseconds
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // After some time, the thread is now RUNNABLE or BLOCKED
    System.out.println(thread1.getName() + " is in state: " + thread1.getState());

    // Create another thread that will join the first thread
    Thread thread2 = new Thread(() -> {
      try {
        thread1.join(); // This will cause thread2 to enter WAITING state
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }, "Thread-2");

    thread2.start(); // Start thread2, which will wait for thread1 to finish

    // Give thread2 some time to execute
    try {
      Thread.sleep(100);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Check the state of both threads after some time
    System.out.println(thread1.getName() + " is in state: " + thread1.getState());
    System.out.println(thread2.getName() + " is in state: " + thread2.getState());

    // Wait for thread1 to complete
    try {
      thread1.join(); // Main thread waits for thread1 to finish
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // Now check the states of both threads again
    System.out.println(thread1.getName() + " is in state: " + thread1.getState());
    System.out.println(thread2.getName() + " is in state: " + thread2.getState());
  }
}

class MyRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " is running.");
    try {
      Thread.sleep(500); // Simulate some work by sleeping
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName() + " is finished.");
  }
}
