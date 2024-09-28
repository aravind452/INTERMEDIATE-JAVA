import java.util.*;

class Lower {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0);
    if (ch >= 'A' && ch <= 'Z') {
      System.out.println(toLowerCase(ch));
    } else if (ch >= 'a' && ch <= 'z') {
      System.out.println(toUpperCase(ch));
    } else {
      System.out.println("Enter Valid Input");
    }
    sc.close();

  }

  public static char toLowerCase(char c) {

    return (char) (c + 32);
  }

  public static char toUpperCase(char c) {

    return (char) (c - 32);
  }
}