package STRINGSPROBLEMSPRACTICE;

public class StringsAreRortationsOfEachOtherOrNot {

  public static void main(String[] args) {
    String s1 = "abcd";
    String s2 = "cdab";

    if (s1.length() == s2.length() && s1.length() > 0) {
      String con = s1 + s1;
      if (con.contains(s2)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }

}
