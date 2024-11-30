package RECURSIONANDBACKTRACKING;

public class SumOfNUsingRecursion {

  public static void main(String[] args) {
    int n = 5;
    // sumOfNUsingRecursion(n, 0);
    System.out.println(sumOfN(n));
  }

  // paramterised way of calculating sum
  static void sumOfNUsingRecursion(int i, int sum) {
    if (i < 1) {
      System.out.println(sum);
      return;
    }
    sumOfNUsingRecursion(i - 1, sum + i);
  }

  // functional way of calculating sum

  static int sumOfN(int n) {
    if (n == 0)
      return 0;
    return n + sumOfN(n - 1);
  }

}
