package CONTROLFLOW;

import java.util.*;

public class ControlFlow1 {

  protected int y = 5;

  protected int num() {
    return 1;
  }

  public static void main(String[] args) {
    int x = 5;
    if (x > 3) {

      System.out.println("x is greater than 10");

    }

    else if (x > 4) {
      System.out.println("x is greater than 4");
    }

    // In this example, you know the loop will run 10 times (from 0 to 9). The
    // number
    // of iterations is known before the loop starts.

    // for (int i = 0; i < 10; i++) {
    // System.out.println(i);
    // }

    Scanner sc = new Scanner(System.in);

    // while (x != 4) {
    // System.out.println("enter");
    // x = sc.nextInt();

    // }

    // for (int a = 2; a != 4;) {
    // System.out.println("enter");
    // a = sc.nextInt();

    // }

    do {
      System.out.println("enter");
      x = sc.nextInt();
    } while (x != 4);

    sc.close();

    
    

  }


}
