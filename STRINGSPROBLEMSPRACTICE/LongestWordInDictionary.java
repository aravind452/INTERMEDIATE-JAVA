package STRINGSPROBLEMSPRACTICE;

public class LongestWordInDictionary {

  public static void main(String[] args) {
    String[] arr = { "pintu", "geeksfor", "geeksgeeks",
        " forgeek" };
    String str = "geeksforgeeks";
    System.out.println(longestWord(arr, str));

  }

  static String longestWord(String[] arr, String str) {

    String longest = "";

    for (String word : arr) {
      if (canForm(word, str)) {
        if (word.length() > longest.length()) {
          longest = word;
        }
      }
    }
    return longest;

  }

  static boolean canForm(String word, String str) {
    int wordIndex = 0;
    int strIndex = 0;
    while (wordIndex < word.length() && strIndex < str.length()) {
      if (word.charAt(wordIndex) == str.charAt(strIndex)) {
        wordIndex++;
      }
      strIndex++;
    }
    return wordIndex == word.length();
  }

}
