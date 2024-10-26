
package MULTITHREADING;

// class RunnableClass implements Runnable {

//   public void run() {
//     for (int i = 0; i < 5; i++) {
//       System.out.println(Thread.currentThread() + "," + i);
//     }
//   }

// }

public class ThreadUsingRunnable {

  public static void main(String[] args) {
    System.out.println("Main thread is starting");

    // MultiThreading1 m = new MultiThreading1("first thread");
    // m.setDaemon(true); // Daeomon Thread
    // m.start();

    // using runnable
    // Thread thread = new Thread(new RunnableClass(), "Thread using runnable");
    // thread.start();

    // using runnable with lambdas

    /*
     * Lambda Expression Maps to run():
     * When you pass a lambda expression to a Thread constructor, Java knows that
     * the lambda is defining the body of the run() method.
     */

    Thread thread = new Thread(() -> {
      for (int i = 0; i < 5; i++) {
        System.out.println(Thread.currentThread() + "," + i);
      }
    }, "Thread using runnable");
    thread.start();

    System.out.println("Main thread is exiting");
  }

}

/*
 * Why second thread executed first?
 * 
 * Java uses a thread scheduling mechanism to determine the order in which
 * threads are executed. The scheduler is influenced by various factors, such as
 * thread priority, the operating system's thread management policies, and the
 * current load on the CPU.
 * Even if you create a thread after another thread, it does not guarantee that
 * the second thread will start executing after the first thread. The JVM
 * decides the execution order based on the scheduling algorithm.
 * 
 * 
 * Here’s a possible breakdown of what could happen:
 * 
 * The main thread prints "Main thread is starting."
 * The main thread starts m from MultiThreading1, which goes into the Runnable
 * state.
 * The main thread starts the RunnableClass thread, which also goes into the
 * Runnable state.
 * The JVM's thread scheduler decides to run the RunnableClass thread first,
 * leading to its output.
 * The MultiThreading1 thread may then start its execution or may run
 * concurrently with the RunnableClass thread, producing interleaved output.
 * 
 * The execution order of threads in Java is determined by the JVM's thread
 * scheduler, which can lead to seemingly unpredictable behavior regarding which
 * thread starts first. In a multithreaded environment, it’s essential to
 * understand that the order of thread creation does not dictate the order of
 * execution.
 * 
 */