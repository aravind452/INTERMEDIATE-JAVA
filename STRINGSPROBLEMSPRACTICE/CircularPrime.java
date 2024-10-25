package STRINGSPROBLEMSPRACTICE;

public class CircularPrime {

  public static void main(String[] args) {
    int n = 10;

    String str = Integer.toString(n);

    int length = str.length();

    int i = 1;

    int count = 0;

    while (i <= length) {

      System.out.println(str);

      if (isPrime(Integer.parseInt(str))) {

        count++;

      }

      str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
      i++;

    }

    System.out.println("Total no of primes " + count);
  }

  static boolean isPrime(int a) {
    if (a == 0 || a == 1 || a % 2 == 0) {
      return false;
    }

    for (int i = 2; i < a; i++) {
      if (a % i == 0)
        return false;
    }
    return true;
  }

}
