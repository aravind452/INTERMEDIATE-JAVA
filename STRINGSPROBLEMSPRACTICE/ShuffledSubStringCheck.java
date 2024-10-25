package STRINGSPROBLEMSPRACTICE;

public class ShuffledSubStringCheck {

  public static void main(String[] args) {
    String str1 = "onetwofour";
    String str2 = "hellofourtwooneworld";
    System.out.println(isShuffled(str1, str2));
  }

  static String isShuffled(String str1, String str2) {
    if (str1.length() > str2.length()) {
      return "NO";
    }
    int[] str1Count = new int[26];
    int[] str2Count = new int[26];

    for (char c : str1.toCharArray()) {
      str1Count[c - 'a']++;
    }
    for (int i = 0; i < str1.length(); i++) {
      str2Count[str2.charAt(i) - 'a']++;
    }
    int start = 0;
    for (int i = str1.length(); i < str2.length(); i++) {
      if (matches(str1Count, str2Count)) {
        return "YES";
      }

      str2Count[str2.charAt(start) - 'a']--;
      start++;

      str2Count[str2.charAt(i) - 'a']++;
    }

    if (matches(str2Count, str1Count)) {
      return "YES";
    }

    return "NO";
  }

  static boolean matches(int[] arr1, int[] arr2) {
    for (int i = 0; i < 26; i++) {
      if (arr1[i] != arr2[i]) {
        return false;
      }
    }
    return true;
  }

}
