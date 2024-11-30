package ANONYMOUSOBJECTS;
public class InnerClass {
  public static void main(String[] args) {
    // how to create object for inner class
    Outer o = new Outer();
    Outer.Inner i = o.new Inner();
    i.config();
  }

}

class Outer {
  int age;

  public void show() {
    System.out.println("Outer class");
  }

  class Inner {

    public void config() {
      System.out.println("Inner class");
    }

  }
}