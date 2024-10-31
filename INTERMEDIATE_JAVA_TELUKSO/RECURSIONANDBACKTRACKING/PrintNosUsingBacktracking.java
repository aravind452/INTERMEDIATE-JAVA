package RECURSIONANDBACKTRACKING;

public class PrintNosUsingBacktracking {

  public static void main(String[] args) {
    // printNosUsingBackTrack(5);
    printNosUsingBackTrackReverse(1, 5);

  }

  // print 1 to n using backtracking
  static void printNosUsingBackTrack(int n) {

    if (n < 1)
      return;

    printNosUsingBackTrack(n - 1);
    System.out.print(n + " ");
  }

  // print n to 1 using backtracking

  static void printNosUsingBackTrackReverse(int i, int n) {

    if (i > n) {
      return;
    }
    printNosUsingBackTrackReverse(i + 1, n);
    System.out.print(i + " ");

  }

}
