package STRINGS;

import java.util.ArrayList;

public class StringConcatenation {

  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    System.out.println('a' + 'b'); // adds the ascii value
    System.out.println("a" + "b"); // concatenates the strings

    // In this case integer wil be converted to Integer wrapper class that will call
    // toString()
    System.out.println("a" + 1); // concatenates the string with the integer

    System.out.println((char) ('a' + 3));

    // + is only defined for strings and primitive types

    // System.out.println(new Integer(56) + new ArrayList<>()); // not possible

    System.out.println(new Integer(56) + "a" + new ArrayList<>()); // possible

    // System.out.println(new ArrayList<>() + new Integer(56) + "a") // not possible

  }

}
