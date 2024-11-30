package RECURSIONANDBACKTRACKING;

public class FactorialUsingRecursion {

  public static void main(String[] args) {
    int n = 5;
    // factorial(n, 1);
    System.out.println(fact(n));
  }

  // using parameterised
  static void factorial(int n, int prod) {

    if (n == 1) {
      System.out.println(prod);
      return;
    }

    factorial(n - 1, prod * n);

  }

  // using functional

  static int fact(int n) {
    if (n == 1) {
      return 1;
    }
    return n * fact(n - 1);
  }

}
