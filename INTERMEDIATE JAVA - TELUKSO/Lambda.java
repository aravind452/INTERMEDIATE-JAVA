@FunctionalInterface
// Lambda expressions work only with functional interface!
interface AB {
  // void foo(int i);

  int add(int i, int j);

}

// class B implements A {
// @Override
// public void foo() {
// System.out.println("B show");
// }

// }

public class Lambda {
  public static void main(String[] args) {

    // A obj = new B();
    // obj.foo();

    // Anonymous Inner Class

    // A obj = new A() {
    // @Override
    // public void foo() {
    // System.out.println("Anonymous Inner Class");
    // }
    // };
    // obj.foo();
    // }

    // Lambda Expression

    // AB obj = (i) -> {
    // System.out.println("Lambda Expression " + i);
    // };
    // obj.foo(5);

    // }

    // Lambda expression with return type

    AB obj = (int i, int j) -> i + j;

    int result = obj.add(5, 4);
    System.out.println(result);
  }

}
