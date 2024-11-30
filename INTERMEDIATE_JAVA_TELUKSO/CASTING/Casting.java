package CASTING;

public class Casting {
  public static void main(String[] args) {

    Obj1 a = new Obj2();
    // Obj1 a = (Obj1) new Obj2(); upcasting // implicit
    a.show1();

    Obj2 b = (Obj2) a;
    b.show2();

  }

}

class Obj1 {
  public void show1() {
    System.out.println("Obj1");
  }
}

class Obj2 extends Obj1 {
  public void show2() {
    System.out.println("Obj2");
  }
}