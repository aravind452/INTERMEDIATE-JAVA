package EXCEPTIONHANDLING;

public class Exception1 {

  public static void main(String[] args) {
    int a = 5;
    int b = 0;

    try {
      divide(a, b);
    } catch (ArithmeticException e) {
      System.out.println("Caught ArithmeticException divide: " + e.getMessage());
    }
    try {
      divide1(a, b);
    } catch (ArithmeticException e) {
      System.out.println("caught exception from divide1" + e.getMessage());
    }

    try {
      divide2(a, b);
    } catch (ArithmeticException e) {
      System.out.println("Caught ArithmeticException from divide2: " + e.getMessage());
    }

    System.out.println("this will exceute");

    // try {
    // divide3(a, b);
    // } catch (ArithmeticException e) {
    // System.out.println("Caught ArithmeticException from divide3: " +
    // e.getMessage());
    // }
    divide3(a, b);
    System.out.println("this will not be exceute");

  }

  // this is an unchecked exception - no need to handle
  static int divide(int a, int b) throws ArithmeticException {

    return a / b;

  }

  // this is a checked exception - need to handle
  static int divide1(int a, int b) throws ArithmeticException {
    return a / b;
  }

  // no need to handle cuz it is an unchecked exception
  static int divide2(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Cannot divide by zero");
    }
    return a / b;
  }

  // need to be handled cuz it is an checked - use either throws or try/catch
  static int divide3(int a, int b) {
    if (b == 0) {
      try {
        throw new ArithmeticException("cant divide by zero");

      } catch (ArithmeticException e) {

        System.out.println("caught exception from divide 3 " + e.getMessage());
      }
    }
    return a / b;
  }

}
