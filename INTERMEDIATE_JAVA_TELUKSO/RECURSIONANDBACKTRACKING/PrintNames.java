package RECURSIONANDBACKTRACKING;

class PrintNames {
  public static void main(String[] args) {
    f(1, 3);

  }

  static void f(int i, int n) {

    if (i > n)
      return;

    System.out.println("aravind");
    f(i + 1, n);

  }
}

/*
 * Time complexity - O(n)
 * Space complexity - O(n)
 */