package STRINGSPROBLEMSPRACTICE;

import java.util.*;

public class IsomorphicStrings {

  public static void main(String[] args) {
    String str1 = "aab";
    String str2 = "xyy";
    System.out.println(ismorphicStrings(str1, str2));
  }

  static boolean ismorphicStrings(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }

    HashMap<Character, Character> map1 = new HashMap<>();

    for (int i = 0; i < str1.length(); i++) {
      char char1 = str1.charAt(i);
      char char2 = str2.charAt(i);

      if (map1.containsKey(char1)) {
        if (map1.get(char1) != char2) {
          return false;
        }
      } else {
        map1.put(char1, char2);
      }

    }
    return true;

  }

}
