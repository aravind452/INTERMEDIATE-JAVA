package CONSTRUCTORCHAINING;

public class Chaining1 {

  public static void main(String[] args) {
    Person p = new Person();
    p.display();

  }

}

class Person {
  private String name;
  private int age;

  Person() {

    this("Unknown", 0);

  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;

  }

  void display() {
    System.out.println(name + " " + age);
  }
}