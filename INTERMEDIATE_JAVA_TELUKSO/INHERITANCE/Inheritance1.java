
/*
 * Inheritance is one of the core concepts of Object-Oriented Programming (OOP)
 * in Java (or any OOP language). It allows one class to inherit properties and
 * behaviors (fields and methods) from another class, promoting code reusability
 * and polymorphism.
 * 
 * Key Concepts of Inheritance
 * Base Class (Parent Class, Superclass): The class whose properties and methods
 * are inherited.
 * Derived Class (Child Class, Subclass): The class that inherits properties and
 * methods from the base class.
 */

public class Inheritance1 {

  public static void main(String[] args) {
    // Box box = new Box();
    // System.out.println(box.h);

    BoxWeight boxWeight = new BoxWeight();
    System.out.println(boxWeight.h + " " + boxWeight.weight);

    Box box = new BoxWeight();
    System.out.println(box.h);
  }

}

class Box {
  private double l;
  double h;
  double w;

  Box(double l, double h, double w) {
    this.l = l;
    this.h = h;
    this.w = w;
  }

  Box() {
    // super();
    System.out.println("box class constructor called");
    this.h = -2;
    this.l = -1;
    this.w = -1;
  }

  Box(double side) {
    this.w = side;
    this.h = side;
    this.l = side;
  }

  Box(Box old) {
    this.l = old.l;
    this.h = old.h;
    this.w = old.w;
  }

  public void info() {
    System.out.println("Running the box");
  }

}

class BoxWeight extends Box {
  double weight;
  // double h;

  public BoxWeight(double l, double h, double w, double weight) {
    // super(l, h, w);
    this.weight = weight;
  }

  public BoxWeight() {
    this(4, 5, 6, 6);
    System.out.println("boxweight class constructor called");
    // this.weight = -1;

    // this.h = -1;
    // System.out.println(this.h);
  }
}