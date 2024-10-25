package STRINGSPROBLEMSPRACTICE;

import java.util.*;

public class SecondNonRepeatingCharacter {

  public static void main(String[] args) {
    String input = "aabbcd";
    HashMap<Character, Integer> charCount = new HashMap<>();

    for (char c : input.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    int k = 0;
    for (char c : input.toCharArray()) {

      if (charCount.get(c) == 1) {
        k++;

        if (k == 2) {
          System.out.println(c);
          break;
        }

      }
    }
  }

}
