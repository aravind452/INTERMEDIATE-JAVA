package ABSTRACTION;

public class Abstraction1 {

  public static void main(String[] args) {
    Son s = new Son(67);
    System.out.println(s.age);

  }

}

abstract class Parent {
  int age;

  public Parent(int age) {
    this.age = age;
  }

  public Parent() {
    System.out.println("parent called");
  }

  void normal() {
    System.out.println("normal method");
  }

  static void staticMethod() {
    System.out.println("static method");
  }

  abstract void career();

  abstract void partner(String name, int age);
}

class Son extends Parent {
  int age;

  public Son(int age) {
    super(age);
    System.out.println("son called" + super.age);

    System.out.println(this.age);

  }

  void career() {
    System.out.println("im going to be a coder");
  }

  void partner(String name, int age) {
    System.out.println(name + " is my partner, he is " + age + " years old");
  }

}