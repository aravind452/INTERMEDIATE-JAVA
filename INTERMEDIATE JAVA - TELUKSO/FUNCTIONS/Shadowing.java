package FUNCTIONS;

public class Shadowing {
  static int a = 56;

  public static void main(String[] args) {

    int a = 57; // shadowing
    System.out.println(a);

  }

}
