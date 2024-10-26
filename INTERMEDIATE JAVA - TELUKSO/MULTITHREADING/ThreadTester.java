package MULTITHREADING;

/*
 * Program
 * A program is a set of instructions written in a programming language to perform a specific task. It can be executed by a computer to achieve desired outcomes.
 * Example:
 * A simple calculator program written in Java 
 * 
 * 
 * Process
 * A process is an instance of a program that is currently being executed. It has its own memory space and system resources. A process is created when a program is loaded into memory and run by the operating system. Each process has a unique process identifier (PID) and its own execution context.
 * Example:

 * When you open a web browser, the operating system creates a process for that browser. Each tab may run in its own process or share processes, depending on the browser architecture.
 * 
 * MULTITASKING
 * Multitasking refers to the ability of an operating system to execute multiple processes concurrently. There are two types of multitasking:

* Cooperative multitasking: Processes voluntarily yield control periodically or when idle, allowing others to run.
* Preemptive multitasking: The operating system decides when to switch processes, allowing more effective CPU utilization.
* Example:

* Running a web browser while downloading a file and listening to music is an example of multitasking, where all three processes are managed by the OS simultaneously.
 */

/*
 * THREAD
 * 
 * A thread is the smallest unit of processing that can be scheduled by the operating system. A thread is a lightweight process; multiple threads can exist within the same process and share resources, such as memory, while still being able to execute independently.

Example:

In a web browser, each tab could be represented as a separate thread. This allows users to interact with one tab while another is loading.
 */

/*
* MULTITHREADING
 * Multithreading is a programming technique that allows the concurrent execution of multiple threads within a single process. This can lead to more efficient use of CPU resources, as threads can run simultaneously and share data more easily.
 */

/*
 * Main thread
 * The main thread is the first thread that is created when a Java application starts. It is the thread that executes the main() method and is responsible for initiating the execution of the program. Every Java application has at least one main thread, and it is considered a user thread as well.
 * 
 * User Thread
 * User threads are threads created by a user application (program). They are the threads that perform the actual work of the application. These threads can be used for tasks such as performing computations, handling user interactions, or managing I/O operations. User threads continue to run independently until they complete their tasks or are explicitly terminated.
 * 
 * Daemon Thread
 * A daemon thread is a special type of thread that runs in the background to perform tasks that are not essential to the program's execution. Daemon threads are typically used for housekeeping tasks, such as garbage collection, monitoring, or background processing. They do not prevent the application from exiting; if all user threads (non-daemon threads) finish their execution, the Java Virtual Machine (JVM) will terminate, even if daemon threads are still running.
 */

class MultiThreading1 extends Thread {

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("Inside Thread " + Thread.currentThread() + " " + i);
    }
  }

  public MultiThreading1(String name) {
    super(name);

  }

}

public class ThreadTester {

  public static void main(String[] args) {

    System.out.println("Main thread is starting");

    MultiThreading1 m = new MultiThreading1("first thread");
    // m.setDaemon(true); // Daeomon Thread
    m.start();

    System.out.println("Main thread is exiting");
  }

}
