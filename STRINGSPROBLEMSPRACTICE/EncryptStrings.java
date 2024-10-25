package STRINGSPROBLEMSPRACTICE;

public class EncryptStrings {

  public static void main(String[] args) {

    System.out.println(encrypt("abc"));

  }

  static String encrypt(String s) {
    StringBuilder str = new StringBuilder();
    char ch = s.charAt(0);
    int count = 0;
    for (int i = 0; i < s.length(); i++) {

      if (s.charAt(i) == ch) {
        count++;
      }

      else {
        str.append(ch).append(Integer.toHexString(count));
        ch = s.charAt(i);
        count = 1;
      }

    }

    str.append(ch).append(Integer.toHexString(count));
    return str.reverse().toString();
  }
}
