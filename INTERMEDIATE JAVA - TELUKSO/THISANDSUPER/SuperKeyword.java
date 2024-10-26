package THISANDSUPER;

/*
 * It is used to refer to the superclass (parent class) of the current object, allowing you to access methods, constructors, or fields from the parent class. 
 * The super keyword can be used to access a field from the parent class if the subclass has a field with the same nameThe super keyword can be used to access a field from the parent class if the subclass has a field with the same name
 */

public class SuperKeyword {

  public static void main(String[] args) {
    Dog1 dog = new Dog1();
    dog.sound();

  }

}

class Animal1 {

  String name = "Animal1";

  Animal1(String name) {
    this.name = name;
  }

  Animal1() {
  }

  void sound() {
    System.out.println("Animal makes a sound");
  }
}

class Dog1 extends Animal1 {
  String name = "Dog1"; // This will hide the name variable from the Animal class.

  Dog1(String name) {
    super(name); // Calls the constructor of Animal
  }

  Dog1() {
  }

  void sound() {
    super.sound();
    System.out.println("Dog barks");
  }

  void printName() {
    System.out.println("Superclass name: " + super.name); // Refers to Animal's name
    System.out.println("Subclass name: " + this.name); // Refers to Dog's name
  }
}