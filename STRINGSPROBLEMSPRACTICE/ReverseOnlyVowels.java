package STRINGSPROBLEMSPRACTICE;

import java.util.ArrayList;
import java.util.List;

public class ReverseOnlyVowels {

  public static void main(String[] args) {
    String str = "Helloworld";
    System.out.println(reverseVowels(str));

  }

  static String reverseVowels(String str) {
    char[] chars = str.toCharArray();
    int left = 0;
    int right = chars.length - 1;

    String vowels = "aeiouAEIOU";

    while (left < right) {

      if (vowels.indexOf(chars[left]) != -1 && vowels.indexOf(chars[right]) != -1) {
        char temp = chars[left];
        chars[left] = chars[right];
        chars[right] = temp;

        left++;
        right--;
      }

      else if (vowels.indexOf(chars[left]) != -1 && vowels.indexOf(chars[right]) == -1) {
        right--;
      }

      else if (vowels.indexOf(chars[left]) == -1 && vowels.indexOf(chars[right]) != -1) {
        left++;

      } else {
        left++;
        right--;
      }

      // if (left < right) {
      // char temp = chars[left];
      // chars[left] = chars[right];
      // chars[right] = temp;

      // left++;
      // right--;
      // }
    }

    return new String(chars);

  }

  public static String reverseVowels1(String s) {
    List<Character> vowelsList = new ArrayList<>();
    char[] chars = s.toCharArray();

    for (char c : chars) {
      if (isVowel(c)) {
        vowelsList.add(c);
      }
    }

    char[] result = new char[chars.length];
    int vowelIndex = vowelsList.size() - 1;

    for (int i = 0; i < chars.length; i++) {
      if (isVowel(chars[i])) {

        result[i] = vowelsList.get(vowelIndex--);
      } else {

        result[i] = chars[i];
      }
    }

    return new String(result);
  }

  private static boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
  }

}
