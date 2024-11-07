package CONTROLFLOW;

public class Controlflow2 extends ControlFlow1 {

  protected int d = 56;

  public static void main(String[] args) {

    ControlFlow1 c = new Controlflow2();

    int z = c.num();
    System.out.println(z);

    int x = 2;
    switch (x) {
      // You cannot declare variables inside a switch block at the top level.
      // int y = 4; // not allowed
      case 1:
        System.out.println("x is 1");
      case 2:
        System.out.println("x is 2");
        break;
      default:
        System.out.println("x is neither 1 nor 2");
    }

    // Enhanced Switch

    switch (x) {

      case 1 -> System.out.println("x is 1");
      case 2 -> System.out.println("x is 2");
      default -> System.out.println("x is neither 1 nor 2");
    }

  }

  protected void num5() {
    System.out.println("num");
  }

}

class ControlFlow3 extends Controlflow2 {
  public static void main(String[] args) {
    Controlflow2 c = new ControlFlow3();
    c.num(); // controlflow1 method can be accessed
    c.num5(); // controlflow2 method can be accesed

  }

  protected void num10() {
    System.out.println("num");
  }
}

/*
 * So, when classes are in the same package, protected methods are accessible
 * via a reference of the parent class!
 */