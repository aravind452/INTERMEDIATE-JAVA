package STRINGSPROBLEMSPRACTICE;



public class Longest {
  public static void main(String[] args) {
    String input = "abcabcab";
    String current = "";
    String longest = "";
    int j = 0, max = 0;
    while (j < input.length()) {
      char c = input.charAt(j);
      if (current.indexOf(c) == -1) {
        current = current + c;
        if (current.length() > max) {
          max = current.length();
          longest = current;
        }
        j++;
      } else {
        current = current.substring(1);
      }
    }
    System.out.println("Longest " + longest);
    System.out.println("Length " + longest.length());

  }

}
