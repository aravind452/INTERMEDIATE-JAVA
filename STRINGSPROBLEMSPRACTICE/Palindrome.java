package STRINGSPROBLEMSPRACTICE;

public class Palindrome {

  public static void main(String[] args) {
    String str = "madam";

    System.out.println(isPalin(str));

  }

  static int isPalin(String str) {
    // String rev = "";
    // for (int i = str.length() - 1; i >= 0; i--) {
    // rev = rev + str.charAt(i);
    // }

    // return str.equals(rev);

    int left = 0;
    int right = str.length() - 1;

    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return 0;
      }
      left++;
      right--;
    }

    return 1;
  }

}
