package INTERFACE_EXTENDS;

public  class Interface1 extends AbstractClass {

  @Override
  public void method2() {

  }

}

interface A {
  void method1();

  void method2();
}

abstract class AbstractClass implements A {
  public void method1() {
    System.out.println("abstrct class");
  }
}


