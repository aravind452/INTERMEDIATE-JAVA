package RECURSIONANDBACKTRACKING;

public class Palindrome {

  public static void main(String[] args) {
    System.out.println(isPalindrome(0, "madam"));
    System.out.println(isPalin(0, 4, "madam"));

  }

  static boolean isPalindrome(int i, String str) {
    if (i >= str.length() / 2) {
      return true;
    }
    if (str.charAt(0) != str.charAt(str.length() - 1)) {
      return false;
    }
    return isPalindrome(i + 1, str);
  }

  static boolean isPalin(int l, int r, String str) {
    if (l >= r) {
      return true;
    }
    if (str.charAt(l) != str.charAt(r)) {
      return false;
    }
    return isPalin(l + 1, r - 1, str);
  }

}

// time complexity - O(n/2)