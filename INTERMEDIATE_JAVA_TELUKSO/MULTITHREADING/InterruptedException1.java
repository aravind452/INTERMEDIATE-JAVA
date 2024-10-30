package MULTITHREADING;

/*
 * The InterruptedException in Java is an exception that occurs when a thread is interrupted while it's waiting, sleeping, or otherwise paused. This exception is a signal to a thread that it should stop what it's doing and either exit or handle the interruption appropriately.
 */

public class InterruptedException1 {

  public static void main(String[] args) throws InterruptedException {

    MyThread myThread = new MyThread();
    System.out.println("MyThread started");
    myThread.start();
    Thread.sleep(2000);
    // try {
    // Thread.sleep(2000);
    // } catch (InterruptedException e) {

    // e.printStackTrace();
    // }
    myThread.interrupt();

  }

}

class MyThread extends Thread {
  public void run() {
    try {
      System.out.println("Thread is going to sleep");
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      System.out.println("Thread was interrupted.");
    }
  }
}

/*
 * Exception Occurs: When the thread calls Thread.sleep(5000) and gets
 * interrupted, the JVM throws an InterruptedException. Internally, the Java
 * Virtual Machine (JVM) creates an instance of the InterruptedException class.
 * 
 * Control Transfer: The control is transferred from the try block to the
 * corresponding catch block because the exception is of the type specified in
 * the catch clause.
 * 
 * Handling the Exception:
 * 
 * Inside the catch block, you can perform any necessary cleanup or logging. For
 * example, you might want to set a flag, log an error message, or release
 * resources.
 */