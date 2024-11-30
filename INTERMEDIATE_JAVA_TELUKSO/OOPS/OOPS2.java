package OOPS;

public class OOPS2 {
  public static void main(String[] args) {

    // Garbage obj;
    // for (int i = 0; i < 10000; i++) {

    // obj = new Garbage();

    // }
  }

}

class Garbage extends Object {

  String name;

  public Garbage() {

  }

  public Garbage(String name) {
    this.name = name;
  }

  @Override
  protected void finalize() {
    System.out.println("Garbage collector called");
  }
}