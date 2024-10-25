package STRINGSPROBLEMSPRACTICE;

import java.util.*;

public class ReverseString {

  public static void main(String[] args) {
    String str = "i.like.this.program.very.much";
    System.out.println(reverse(str));

  }

  static String reverse(String str) {
    StringBuffer reversed = new StringBuffer();
    String[] arr = str.split("\\.");
    System.out.println(Arrays.toString(arr));
    for (int i = arr.length - 1; i >= 0; i--) {

      if (i == 0) {
        reversed.append(arr[i]);
      } else {
        reversed.append(arr[i] + ".");
      }
    }

    return reversed.toString();

  }
}
