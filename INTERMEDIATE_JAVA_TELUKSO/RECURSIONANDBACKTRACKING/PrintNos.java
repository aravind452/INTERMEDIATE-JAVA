package RECURSIONANDBACKTRACKING;

public class PrintNos {

  public static void main(String[] args) {

    // printNos(1, 4);
    printNosReverse(5);

  }

  static void printNos(int i, int n) {
    if (i > n)
      return;
    System.out.println(i);
    printNos(i + 1, n);
  }

  // from n - 1

  static void printNosReverse(int n) {
    if (n <= 0)
      return;
    System.out.println(n);
    printNosReverse(n - 1);
  }

}