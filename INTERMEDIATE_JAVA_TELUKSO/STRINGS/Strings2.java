package STRINGS;

public class Strings2 {

  public static void main(String[] args) {

    String s = "hello";
    String res = s.concat("world"); // concat stores in heap

    res = res.intern();

    String res1 = "helloworld";

    System.out.println(res == res1); // true

  }

}
