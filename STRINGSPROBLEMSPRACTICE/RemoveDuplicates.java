package STRINGSPROBLEMSPRACTICE;

public class RemoveDuplicates {

  public static void main(String[] args) {
    String str = "array";

    StringBuilder buf = new StringBuilder();

    int[] ch = new int[128];

    for (char c : str.toCharArray()) {

      if (ch[c] == 0) {
        buf.append(c);
        ch[c]++;
      }

    }

    System.out.println(buf);
  }

}
