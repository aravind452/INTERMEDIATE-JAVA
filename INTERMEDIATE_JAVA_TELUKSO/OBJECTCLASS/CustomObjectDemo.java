package OBJECTCLASS;

public class CustomObjectDemo {

  public static void main(String[] args) {
    Dog dog = new Dog();
    System.out.println(dog instanceof Dog);
    System.out.println(dog instanceof Animal);
    System.out.println(dog instanceof Object);

    Animal animal = new Dog();
    System.out.println(animal instanceof Dog); // true

    Animal animal2 = new Animal();
    System.out.println(animal2 instanceof Dog); // false

  }

}

class Animal {
  String name;

  public Animal() {

  }

  public Animal(String name) {
    this.name = name;
  }

  public void speak() {
    System.out.println(name + " is speaking!");
  }
}

class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  public Dog() {

  }

  public void speak() {

    System.out.println(name + " barks");

  }
}