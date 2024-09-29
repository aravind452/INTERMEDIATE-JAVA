public class DynamicMethodDispatch {
  public static void main(String[] args) {
    M obj = new N(); // N show
    obj.show();

    obj = new M();
    obj.show(); // M show
  }

}

class M {

  void show() {
    System.out.println("in M show");
  }

}

class N extends M {
  void show() {
    System.out.println("in N show");
  }

}