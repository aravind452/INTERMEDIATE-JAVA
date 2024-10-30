package OBJECTCLASS;

public class CustomObject {
  int num;

  CustomObject() {
  }

  CustomObject(int num) {
    this.num = num;
  }

  public boolean equals1(CustomObject obj) {
    System.out.println("hello" + obj.num + this.num);
    return this.num == obj.num;
  }

}

class SubClass extends CustomObject {
  int num;

  SubClass(int num) {
    super(num);
    this.num = num;

  }

  public static void main(String[] args) {

    /*
     * When you call s.equals1(s1), even though s1 is an instance of SubClass, it is
     * being passed as a CustomObject because of the inheritance relationship. The
     * Java runtime will treat s1 as a CustomObject in the context of the equals1
     * method.
     */

    SubClass s = new SubClass(45);
    SubClass s1 = new SubClass(45);

    boolean obj = s.equals1(s1);
    System.out.println(obj);

  }

}
