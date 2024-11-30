package LAMBDAS;
@FunctionalInterface
// Lambda expressions work only with functional interface!
interface AB {
  // void foo(int i);

  int add(int i, int j);

  default int low() { // default methods always require a body/implementation

    return 0;
  }

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
    AB obj2 = (int i, int j) -> {
      int sum = i + j;
      return sum;
    };

    int result = obj.add(5, 4);
    int result2 = obj2.add(5, 6);
    System.out.println(result + " " + result2);
  }

}
