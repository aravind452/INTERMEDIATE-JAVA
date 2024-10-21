import java.util.*;
import CONTROLFLOW.*;

class Array1 extends ControlFlow1 {

  int[] res1;
  protected int d;

  protected int num2() {
    return 1;
  }

  {
    System.out.println("");
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // 2D Arrays

    int[][] arr = new int[2][];

    // int[][] arr2 = { { 1, 2 }, { 3, 4 } };

    // System.out.println(arr2[1]);

    for (int i = 0; i < arr.length; i++) {
      arr[i] = new int[2];
      for (int j = 0; j < arr[i].length; j++) {

        arr[i][j] = sc.nextInt();

      }

    }

    for (int[] a : arr) {
      System.out.println(Arrays.toString(a));

    }

    System.out.println(Arrays.deepToString(arr));
    sc.close();

    Array1 a = new Array1();
    int c = a.y;
    System.out.println(c);

  }
}

class Array2 extends Array1 {

  static Array2 a = new Array2();

  // int c = a.num();
  public static void main(String[] args) {
    int d = a.num();
    /*
     * The error arises because protected methods are visible based on the reference
     * type, and Array1 does not have visibility into ControlFlow1’s protected
     * methods from a different package.
     */
    System.out.println(d);

  }

  protected int num3() {
    return 10;
  }
}

/*
 * If ControlFlow1, Array1, and Array2 are all in the same package, you will be
 * able to access the protected method num() from ControlFlow1 using an Array1
 * reference without any visibility issues. This illustrates the significance of
 * package structure in Java's access control mechanism.
 */