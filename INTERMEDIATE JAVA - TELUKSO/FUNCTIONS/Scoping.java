package FUNCTIONS;

public class Scoping {

  public static void main(String[] args) {
    int x = 5;
    System.out.println(x);

    // Block scope
    {
      x = 45;
      int c = 56;
      System.out.println(c);
    }

    // System.out.println(c); // block scope
  }

}
