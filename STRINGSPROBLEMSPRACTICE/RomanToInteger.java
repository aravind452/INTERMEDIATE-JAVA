package STRINGSPROBLEMSPRACTICE;

import java.util.*;

public class RomanToInteger {

  public static void main(String[] args) {

    System.err.println(romanToInteger("XXXXXX"));

  }

  static int romanToInteger(String str) {

    HashMap<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);

    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      if (i + 1 < str.length() && romanMap.get(str.charAt(i)) < romanMap.get(str.charAt(i + 1))) {
        sum += romanMap.get(str.charAt(i + 1)) - romanMap.get(str.charAt(i));
      } else {
        sum += romanMap.get(str.charAt(i));
      }
    }
    return sum;

  }

}
