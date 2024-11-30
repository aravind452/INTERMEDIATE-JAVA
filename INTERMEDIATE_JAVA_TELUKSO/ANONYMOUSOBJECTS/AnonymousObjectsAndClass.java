package ANONYMOUSOBJECTS;
public class AnonymousObjectsAndClass {
  public static void main(String[] args) {
    // Anonymous object
    // System.out.println(new ABClass().method());

    // Inner Class(Anonymous Class) inside AnonymousObjectsAndClass
    // A obj = new A() {
    // public void show() {
    // System.out.println("Anonymous object");
    // }
    // };
    // obj.show();

  }

}

class ABClass {
  public int method() {
    System.out.println("ABClass method");
    return 1;
  }
}

class One {
  public void show() {
    System.out.println("One");
  }
}
