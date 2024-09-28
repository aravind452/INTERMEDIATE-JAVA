public class AnonymousObjects {
  public static void main(String[] args) {
    // Anonymous object
    System.out.println(new ABClass().method());

  }

}

class ABClass {
  public int method() {
    System.out.println("ABClass method");
    return 1;
  }
}
