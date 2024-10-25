package STRINGSPROBLEMSPRACTICE;

import java.util.*;

public class AnagramSubstringSearch {

  public static void main(String[] args) {
    String s = "cbaebabacd";
    String p = "abc";
    System.out.println(findAnagrams(s, p));

  }

  static List<Integer> findAnagrams(String str, String pat) {
    List<Integer> res = new ArrayList<>();
    if (str.length() < pat.length())
      return res;
    int[] sCount = new int[26];

    int[] pCount = new int[26];

    for (char c : pat.toCharArray()) {
      pCount[c - 'a']++;
    }

    for (int i = 0; i < pat.length(); i++) {
      sCount[str.charAt(i) - 'a']++;
    }

    if (matches(sCount, pCount))
      res.add(0);

    for (int i = pat.length(); i < str.length(); i++) {
      sCount[str.charAt(i) - 'a']++;
      sCount[str.charAt(i - pat.length()) - 'a']--;

      if (matches(sCount, pCount))
        res.add(i - pat.length() + 1);
    }

    return res;

  }

  static boolean matches(int[] s, int[] p) {
    for (int i = 0; i < s.length; i++) {
      if (s[i] != p[i])
        return false;
    }

    return true;
  }

}
