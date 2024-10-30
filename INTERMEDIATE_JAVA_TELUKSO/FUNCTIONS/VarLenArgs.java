package FUNCTIONS;

public class VarLenArgs {

  public static void main(String[] args) {

    fun();
    multiple(89, 0, 23, 444);

  }

  // variable length arrays
  static void fun(int... v) {
    System.out.println(v.length);

  }

  static void multiple(int a, int b, int... v) {
    System.out.println(a);
  }

  // not possible
  // static void multiple1(int a, int... v, int b) {
  // System.out.println(a);
  // }

}
