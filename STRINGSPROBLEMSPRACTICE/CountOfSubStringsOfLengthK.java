package STRINGSPROBLEMSPRACTICE;

import java.util.*;

public class CountOfSubStringsOfLengthK {

  public static void main(String[] args) {
    String str = "aabcdabbcdc";
    int k = 3;
    System.out.println(countSubstrings1(str, k));

  }

  static int countSubStrings(String str, int k) {
    int count = 0;
    HashSet<Character> set = new HashSet<>();
    if (k > str.length())
      return -1;

    int left = 0;

    for (int right = 0; right < str.length(); right++) {

      set.add(str.charAt(right));

      while (set.size() > k) {
        set.remove(str.charAt(left));
        left++;
      }
      if ((set.size() == k) && (right - left + 1) == k)
        count++;

    }
    return count;
  }

  public static int countSubstrings1(String str, int K) {
    int count = 0;
    int start = 0;
    HashSet<Character> set = new HashSet<>();

    for (int end = 0; end < str.length(); end++) {
      set.add(str.charAt(end));

      if (end - start + 1 == K) {

        if (set.size() == K) {
          count++;
        }

        set.remove(str.charAt(start));
        start++;
      }
    }

    return count;
  }

}
