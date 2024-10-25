package STRINGSPROBLEMSPRACTICE;

import java.util.*;;

public class AreKAnagrams {

  public static void main(String[] args) {
    String str1 = "anagram";
    String str2 = "grammar";
    System.out.println(areKAnagrams(str1, str2, 3));

  }

  static boolean areKAnagrams(String str1, String str2, int k) {
    if (str1.length() != str2.length()) {
      return false;
    }

    int[] count1 = new int[26];
    int[] count2 = new int[26];
    for (int i = 0; i < str1.length(); i++) {
      count1[str1.charAt(i) - 'a']++;
    }
    for (int i = 0; i < str2.length(); i++) {
      count2[str2.charAt(i) - 'a']++;
    }

    System.out.println(Arrays.toString(count1));
    System.out.println(Arrays.toString(count2));
    int needed = 0;
    for (int i = 0; i < 26; i++) {
      if (count1[i] > count2[i]) {

        needed += (count1[i] - count2[i]);

      }
    }
    System.out.println(needed);
    return needed <= k;

  }

}
