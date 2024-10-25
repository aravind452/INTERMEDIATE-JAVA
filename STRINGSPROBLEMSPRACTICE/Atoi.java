package STRINGSPROBLEMSPRACTICE;

public class Atoi {

  public static void main(String[] args) {

    System.out.println(myAtoi("1234"));

  }

  static int myAtoi(String s) {

    int i = 0;
    long result = 0;

    int sign = 1;

    s = s.trim();

    if (s.isEmpty())
      return 0;

    if (s.charAt(i) == '+' || s.charAt(i) == '-') {
      sign = (s.charAt(i) == '-') ? -1 : 1;
      i++;
    }

    while (i < s.length() && Character.isDigit(s.charAt(i))) {
      result = result * 10 + (s.charAt(i) - '0');

      if (result * sign > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
      if (result * sign < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }

      i++;
    }

    return (int) (result * sign);

  }

}
