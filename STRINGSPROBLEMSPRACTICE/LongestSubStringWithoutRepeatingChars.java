package STRINGSPROBLEMSPRACTICE;

import java.util.*;

public class LongestSubStringWithoutRepeatingChars {

  public static void main(String[] args) {
    System.out.println(length1("GEEKSFORGEEKS"));

  }

  static int length(String s) {
    int start = 0, maxLength = 0, end = 0;
    Set<Character> set = new LinkedHashSet<>();

    for (end = 0; end < s.length(); end++) {
      System.out.println(set);
      while (set.contains(s.charAt(end))) {
        set.remove(s.charAt(start));
        start++;

      }
      set.add(s.charAt(end));

      maxLength = Math.max(maxLength, end - start + 1);

    }
    return maxLength;
  }

  static int length1(String s) {
    int i = 0, j = 0, max = 0;
    Set<Character> set = new HashSet<>();

    while (j < s.length()) {
      if (!set.contains(s.charAt(j))) {
        set.add(s.charAt(j++));
        max = Math.max(max, set.size());
      } else {
        set.remove(s.charAt(i++));
      }
    }

    return max;
  }

}
