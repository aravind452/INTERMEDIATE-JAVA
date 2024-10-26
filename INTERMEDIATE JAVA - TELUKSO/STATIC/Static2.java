package STATIC;

public class Static2 {

  static int a = 5;
  static int b = 10;
  static {
    System.out.println("Static block");
    b = a * 5;
  }

  public static void main(String[] args) {

    // Static2 s = new Static2();
    System.out.println("a = " + Static2.a);
    System.out.println("b = " + Static2.b);
    System.out.println("next block");
    // Static2 s1 = new Static2();

  }

}
