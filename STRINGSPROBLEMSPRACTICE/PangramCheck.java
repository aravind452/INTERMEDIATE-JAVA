package STRINGSPROBLEMSPRACTICE;

import java.util.*;

public class PangramCheck {

  public static void main(String[] args) {
    String str = "leetcode";
    System.out.println(check(str));

  }

  static boolean check(String str) {

    str = str.toLowerCase();
    Set<Character> set = new HashSet<>();
    for (char c : str.toCharArray()) {
      if (c >= 'a' && c <= 'z') {
        set.add(c);
      }
    }

    return set.size() == 26;

  }

}
