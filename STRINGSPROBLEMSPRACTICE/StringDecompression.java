package STRINGSPROBLEMSPRACTICE;

public class StringDecompression {
  public static void main(String[] args) {

    System.out.println(decompress("a10b2"));

  }

  static String decompress(String str) {
    StringBuilder sb = new StringBuilder();
    int i = 0;

    while (i < str.length()) {
      char ch = str.charAt(i);
      i++;

      StringBuilder count = new StringBuilder();
      while (i < str.length() && Character.isDigit(str.charAt(i))) {

        count.append(str.charAt(i));
        i++;

      }

      int countInt = Integer.parseInt(count.toString());

      for (int j = 0; j < countInt; j++) {
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}
