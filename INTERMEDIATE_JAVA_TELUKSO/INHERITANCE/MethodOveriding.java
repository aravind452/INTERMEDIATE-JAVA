
public class MethodOveriding {
  public static void main(String[] args) {
    B b = new B(5);
    b.show();

  }

}

class A {
  A() {
    System.out.println("parent class");
  }

  public void show() {
    System.out.println("Inside A's show()");
  }
}

class B extends A {
  B(int age) {
    System.out.println(age);
  }

  public void show() {
    // Parent's class method
    System.out.println("Inside B's show()");
  }

}
