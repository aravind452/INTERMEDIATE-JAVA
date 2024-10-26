public class Polymorphism2 {
  public static void main(String[] args) {

    /*
     * For static methods, the compiler determines which method to call based solely
     * on the reference type (the class) at compile-time.
     */

    // StaticClass s = new StaticClass2();
    // s.area();

  }

}

class StaticClass {
  static void area() {
    System.out.println("Area of StaticClass");
  }
}

class StaticClass2 extends StaticClass {

  static void area() {
    System.out.println("Area of StaticClass2");
  }
}

// why instance vars can not be overidden

/*
 * What Happens at Runtime:
 * Unlike method overriding, where the actual object type determines which
 * method is called at runtime, for instance variables, the reference type
 * determines which variable is accessed.
 * Even though obj refers to an object of type Child, it uses the x from the
 * Parent class because the reference type is Parent.
 */