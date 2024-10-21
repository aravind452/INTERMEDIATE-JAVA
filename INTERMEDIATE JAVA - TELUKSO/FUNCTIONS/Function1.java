package FUNCTIONS;

public class Function1 {

  int nonStaticVariable = 1;
  static int var = 23;

  void method() {
    System.out.println(nonStaticVariable);
    method2();
    System.out.println("var " + var++);
  }

  void method2() {
    System.out.println("Method 2");
    method3();
  }

  static void method3() {
    System.out.println("static method3");

  }

  public static void main(String[] args) {

    // System.out.println(nonStaticVariable); // non-static variable cannot be
    // accessed
    Function1 f = new Function1();
    f.method();

    Function1 f2 = new Function1();
    f2.method();

  }

}
