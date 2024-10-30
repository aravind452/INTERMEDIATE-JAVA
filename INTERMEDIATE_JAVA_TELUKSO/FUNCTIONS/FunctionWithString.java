package FUNCTIONS;

public class FunctionWithString {

  public static void main(String[] args) {
    String org = "aravind";
    String newOrg = changeName(org);
    org = newOrg;
    System.out.println(org);

  }

  static String changeName(String name) {
    return name + " is a good boy";

  }

}
