public class FinalKeyword {

  public static void main(String[] args) {

    final int b = 8;
    System.out.println(b);
    // b = 10; // Error: cannot assign a value to final variable b
    Calc c = new Calc();
    c.show();
    // Adv a = new Adv();
    // a.add();

  }
}

class Calc {
  public final void add(int a, int b) {
    System.out.println(a + b);
  }

  public void show() {
    System.out.println("Calc Show");
  }
}

class Adv extends Calc {
  public void show() {
    System.out.println("Adv Show");
  }

  // public void add(int a, int b) { // Not possible
  // System.out.println("Adv Add");

  // }
}
