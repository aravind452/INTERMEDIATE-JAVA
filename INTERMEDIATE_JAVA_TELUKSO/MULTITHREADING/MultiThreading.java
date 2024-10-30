package MULTITHREADING;
// Dividing the task into smallest threads!

class FirstInterface implements Runnable {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {

        e.printStackTrace();
      }
    }
  }

}

class SecondInterface implements Runnable {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Hello");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {

        e.printStackTrace();
      }
    }
  }

}

// class First extends Thread {
// public void run() {
// for (int i = 0; i < 50; i++) {
// System.out.println("Hi");
// try {
// Thread.sleep(3000);
// } catch (InterruptedException e) {

// e.printStackTrace();
// }
// }

// }
// }

// class Second extends Thread {
// public void run() {
// for (int i = 0; i < 50; i++) {
// System.out.println("Hello");
// try {
// Thread.sleep(3000);
// } catch (InterruptedException e) {

// e.printStackTrace();
// }
// }

// }
// }

class MultiThreading {

  public static void main(String[] args) throws Exception {
    // USING THREAD CLASS
    // First a = new First();
    // Second b = new Second();
    // a.setPriority(Thread.MIN_PRIORITY);
    // b.setPriority(Thread.MAX_PRIORITY);
    // System.out.println(a.getPriority());
    // System.out.println(b.getPriority());
    // a.start();
    // Thread.sleep(1000);
    // b.start();

    // USING RUNNABLE INTERFACE

    // FirstInterface fi = new FirstInterface();
    // SecondInterface si = new SecondInterface();

    // Thread t1 = new Thread(fi);
    // Thread t2 = new Thread(si);

    // t1.start();
    // t2.start();

    // USING ANONYMOUS CLASS

    // Runnable obj1 = new Runnable() {
    // public void run() {
    // for (int i = 0; i < 5; i++) {
    // System.out.println("Hello");
    // try {
    // Thread.sleep(1000);
    // } catch (InterruptedException e) {
    // e.printStackTrace();
    // }
    // }
    // }

    // };

    // Thread t1 = new Thread(obj1);
    // t1.start();

    // USING LAMBDA EXPRESSIONS

    Runnable obj1 = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println("Hello");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    };

    Thread t1 = new Thread(obj1);
    t1.start();

  }

}
