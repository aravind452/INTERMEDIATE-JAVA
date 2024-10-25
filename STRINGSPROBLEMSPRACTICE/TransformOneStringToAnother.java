package STRINGSPROBLEMSPRACTICE;

public class TransformOneStringToAnother {

  public static void main(String[] args) {
    String str1 = "ABD";
    String str2 = "BAD";
    System.out.println(minOps(str1, str2));
  }

  static int minOps(String str1, String str2) {
    if (str1.length() != str2.length())
      return -1;
    int str2Len = str2.length() - 1;
    int str1Len = str1.length() - 1;

    for (int i = str1Len; i >= 0; i--) {
      if (str1.charAt(i) == str2.charAt(str2Len)) {
        str2Len--;
        if (str2Len < 0)
          break;
      }
    }
    return str2Len + 1;
  }

}
