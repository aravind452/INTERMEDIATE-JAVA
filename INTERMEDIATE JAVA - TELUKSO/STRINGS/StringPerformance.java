package STRINGS;

public class StringPerformance {

  public static void main(String[] args) {
    // in this case new object ic created every time which leads to performance
    // issues
    String series = "";
    for (int i = 0; i < 26; i++) {
      char ch = (char) ('a' + i);
      series = series + ch;

    }
    System.out.println(series + " ");

    StringBuffer s = new StringBuffer("rrun");
    StringBuffer s1 = new StringBuffer("rahul");
    System.out.println(s.compareTo(s1));

  }

}
