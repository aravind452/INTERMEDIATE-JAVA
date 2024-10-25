package STRINGSPROBLEMSPRACTICE;

public class EqualPoint {

  public static void main(String[] args) {

    System.out.println(findEqualPoint("(())))("));

  }

  static int findEqualPoint(String str) {
    int balance = 0;
    int equalPoint = -1;

    for (int k = 0; k < str.length(); k++) {
      if (str.charAt(k) == '(') {
        balance++;
      } else if (str.charAt(k) == ')') {
        balance--;
      }

      if (balance == 0) {
        equalPoint = k + 1;
      }
    }

    return equalPoint;

  }

}
