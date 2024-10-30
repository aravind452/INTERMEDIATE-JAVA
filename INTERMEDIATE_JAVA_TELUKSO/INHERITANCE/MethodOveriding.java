
public class MethodOveriding {
  public static void main(String[] args) {
    B b = new B();
    b.show();

  }

}

class A {
  public void show() {
    System.out.println("Inside A's show()");
  }
}

class B extends A {
  public void show() {
    super.show(); // Parent's class method
    System.out.println("Inside B's show()");
  }

}
