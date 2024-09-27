class ThisAndSuper {

  public static void main(String[] args) {
    // BClass b = new BClass();
    // BClass b1 = new BClass(5);

    // BClass thisObj = new BClass(5);

  }

}

class AClass extends Object {

  public AClass() {
    System.out.println("AClass");
  }

  public AClass(int a) {
    System.out.println("AClass(int a)");
  }

}

class BClass extends AClass {

  public BClass() {
    // super(5);
    System.out.println("BClass");
  }

  public BClass(int a) {
    this();
    System.out.println("BClass(int a)");
  }

}
