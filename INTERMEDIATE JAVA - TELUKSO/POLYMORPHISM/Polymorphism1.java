class Shapes {

  void area() {
    System.out.println("Im in shapes class");
  }

  // @Override
  // public String toString() {

  // return super.toString();
  // }

}

class Circle extends Shapes {
  void area() {

    System.out.println("Im in Circle class");
  }

}

class Rectangle extends Shapes {
  void area() {
    System.out.println("Im in Rectangle class");
  }

}

class Square extends Shapes {
  void area() {

    System.out.println("Im in Square class");
  }

}

public class Polymorphism1 {
  public static void main(String[] args) {
    // Dynamic Method Dispatch
    /*
     * The reference type (Shapes) limits which methods are visible to the reference
     * (i.e., only methods defined in the Shapes class can be called).
     * The object type (Circle) determines which implementation of those methods
     * (like area()) will be executed at runtime.
     * This is why sh.area() works and calls the Circle version of area()—the method
     * is defined in Shapes and overridden in Circle. However, the reference sh
     * still cannot access methods that are exclusive to Circle unless the reference
     * is changed to Circle.
     */
    Shapes sh = new Circle();

    // System.out.println(sh.toString());

    sh.area();

  }
}